package com.ecom.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpSession;

import com.ecom.dao.JpaUtil;
import com.ecom.dao.OrderDao;
import com.ecom.dao.ProductDao;
import com.ecom.dao.UserDao;
import com.ecom.dao.WishItemDao;
import com.ecom.model.OrderHeader;
import com.ecom.model.OrderLine;
import com.ecom.model.Product;
import com.ecom.model.User;
import com.ecom.model.WishItem;

public class EcomService {

	public static List<OrderHeader> getAllOrders(int userId){
		return new OrderDao().getOrders(userId);
	}
	
	public static List<OrderHeader> getAllOrders(User user){
		return new OrderDao().getOrders(user);
	}
	
	public static User login(String username, String password){
		User user = new UserDao().getUser(username);
		if(user != null && user.getEmail().equalsIgnoreCase(username) && user.getPassword().equals(password)){
			return user;
		}
		
		return null;
		
	}
	
	
	public static User findUser(String username){
		return  new UserDao().getUser(username);
	}
	
	public static Product getProduct(int productId){
		ProductDao dao = new ProductDao();
		Product p = dao.getProduct(productId);
		return p;
	}
	
	 public static OrderHeader getCart(HttpSession session){
	    	OrderHeader cart = (OrderHeader) session.getAttribute("cart");
	    	return cart;
	    }

		public static void  addToCart(int productId, int qty,  HttpSession session){
			
			OrderHeader cart = (OrderHeader) session.getAttribute("cart");
			if(cart == null){
				cart = new OrderHeader(); 
				List<OrderLine> orderlines = new ArrayList<OrderLine>();
				cart.setOrderlines(orderlines);
			}
			
		
			boolean existInCart = false;
			for(OrderLine line : cart.getOrderlines()){
				if(line.getProduct().getProductId() == productId){
					line.setQty(line.getQty()+qty);
					line.setOrderlineTotalPrice(line.getProduct().getPrice() * line.getQty());
					cart.setTotal(cart.getTotal() + ( line.getProduct().getPrice()*qty) );
					existInCart = true;
				}
			}
			
			if(!existInCart){
				ProductDao dao = new ProductDao();
				Product p = dao.getProduct(productId);
				OrderLine newLine = new OrderLine();
				newLine.setOrderlinePrice(p.getPrice());
				newLine.setOrderlineTotalPrice(p.getPrice() * qty);
				newLine.setProductName(p.getName());
				newLine.setQty(qty);
				newLine.setProduct(p);
				cart.getOrderlines().add(newLine);
				
				cart.setTotal(cart.getTotal() + newLine.getOrderlineTotalPrice());
			}
				
			session.setAttribute("cart", cart);
		}
		
		public static void removeItemFromCart(int productId, HttpSession session){
			OrderHeader cart = (OrderHeader) session.getAttribute("cart");
		    for (Iterator<OrderLine> iterator = cart.getOrderlines().iterator();  iterator.hasNext();) {
		    	OrderLine line = iterator.next();
		    	if(line.getProduct().getProductId() == productId){
		    		iterator.remove();
		    		break;
		    	}
		    }
		    
		    double orderTotal = 0;
		    for(OrderLine line : cart.getOrderlines()){
		    	orderTotal += line.getOrderlineTotalPrice();
		    }
		    cart.setTotal(orderTotal);
		    
		    if(cart.getOrderlines().size()<=0){
		    	session.removeAttribute("cart");
		    }
		}
		
		public static OrderHeader createOrder(OrderHeader order){
			OrderDao orderDao = new OrderDao();
			OrderHeader o = orderDao.createOrder(order);
			return o;
		}
		
		public static void createUser(User user){
			new UserDao().createUser(user);
		}
		
		public static WishItem addWishItem(int productId, User user){
			EntityManager em = JpaUtil.createEntityManager();
			Product p = em.find(Product.class, productId);
			return new WishItemDao().add(p, user);
		}
		
		public static List<WishItem> getWishItems(User user){
			return new WishItemDao().getWishItems(user);
		}
		
	
}
