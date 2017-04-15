package com.ecom.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecom.model.OrderHeader;
import com.ecom.model.OrderLine;
import com.ecom.model.User;

public class OrderDao {
	
	public  OrderHeader createOrder(OrderHeader order){
		 EntityManager em = JpaUtil.createEntityManager();
		
		 em.getTransaction().begin();
		 em.persist(order);
		 em.getTransaction().commit();
		 
		 for(OrderLine orderLine : order.getOrderlines()){
			 orderLine.setOrderheader(order);
			 em.getTransaction().begin();
			 em.merge(orderLine);
			 em.getTransaction().commit();
		 }
		 
		 em.close();
		 return order;
	}
	
	public List<OrderHeader> getOrders(int userId){
		  EntityManager em = JpaUtil.createEntityManager();
		    Query q = em.createQuery("select o from OrderHeader o");
			@SuppressWarnings("unchecked")
			List<OrderHeader> orders = q.getResultList();
			em.close();
			return orders;
	}
 
	public List<OrderHeader> getOrders(User user){
		  EntityManager em = JpaUtil.createEntityManager();
		    Query q = em.createQuery("select o from OrderHeader o where o.user :user");
		    q.setParameter("user", user);
			@SuppressWarnings("unchecked")
			List<OrderHeader> orders = q.getResultList();
			em.close();
			return orders;
	}
}
