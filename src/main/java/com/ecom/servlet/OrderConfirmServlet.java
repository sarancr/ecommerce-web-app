package com.ecom.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecom.model.Address;
import com.ecom.model.OrderHeader;
import com.ecom.model.User;
import com.ecom.service.EcomService;

/**
 * Servlet implementation class OrderConfirmServlet
 */
@WebServlet("/placeorder")
public class OrderConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OrderHeader order = EcomService.getCart(request.getSession(true));
		
		Address billto = new Address();
		billto.setFirstname(request.getParameter("billing_first_name"));
		billto.setLastname(request.getParameter("billing_last_name"));
		billto.setCompanyName(request.getParameter("billing_company"));
		billto.setAddress1(request.getParameter("billing_address_1"));
		billto.setAddress2(request.getParameter("billing_address_2"));
		billto.setCity(request.getParameter("billing_city"));
		billto.setCounty(request.getParameter("billing_state"));
		billto.setZip(request.getParameter("billing_postcode"));
		billto.setEmail(request.getParameter("billing_email"));
		billto.setPhone(request.getParameter("billing_phone"));
		order.setAddress1(billto);
		billto.setType(1);
		
		String isShiptoDifferent = request.getParameter("ship_to_different_address");
		Address shipto = null;
		if(isShiptoDifferent != null &&  !isShiptoDifferent.isEmpty()){
			shipto = new Address();
			shipto.setFirstname(request.getParameter("shipping_first_name"));
			shipto.setLastname(request.getParameter("shipping_last_name"));
			shipto.setCompanyName(request.getParameter("shipping_company"));
			shipto.setAddress1(request.getParameter("shipping_address_1"));
			shipto.setAddress2(request.getParameter("shipping_address_2"));
			shipto.setCity(request.getParameter("shipping_city"));
			shipto.setCounty(request.getParameter("shipping_state"));
			shipto.setZip(request.getParameter("shipping_postcode"));
			shipto.setEmail(request.getParameter("shipping_email"));
			shipto.setPhone(request.getParameter("shipping_phone"));
			billto.setType(2);
		}else{
			shipto = billto;
		}
		
		// Create a new user if required
		String password = request.getParameter("user_password");
	    System.out.println("OrderConfirmServlet - user_password = " + password);
		if(password != null && !password.isEmpty()){
			User user = new User();
			user.setEmail(billto.getEmail());
			user.setPassword(password);
			user.setFirstname(billto.getFirstname());
			user.setLastname(billto.getLastname());
			user.setPhone(billto.getPhone());
			List<Address> addresses = new ArrayList<Address>();
			//addresses.add(billto);
			//addresses.add(shipto);
			User userFound = EcomService.findUser(billto.getEmail());
			if(userFound == null){
				EcomService.createUser(user);
				order.setUser(user);
			}else{
				order.setUser(userFound);
			}
			
		}
		
		order.setAddress2(shipto);
		order.setPaymethod(request.getParameter("payment_method"));
		order.setStatus("In Process");
		OrderHeader createdOrder = EcomService.createOrder(order);
		System.out.println("Order has been created - OrderID = " + createdOrder.getOrderId());
	    
		//Empty cart
		request.getSession(true).removeAttribute("cart");
		request.setAttribute("order", createdOrder);
	
		request.getRequestDispatcher("/confirmation.jsp").forward(request, response);
		
	}

}
