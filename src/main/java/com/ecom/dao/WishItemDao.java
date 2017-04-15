package com.ecom.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecom.model.Product;
import com.ecom.model.User;
import com.ecom.model.WishItem;

public class WishItemDao {

	public WishItem  add(Product p, User user){
		 EntityManager em = JpaUtil.createEntityManager();
		 WishItem item = new WishItem();
		 item.setProduct(p);
		 item.setUser(user);
		 em.getTransaction().begin();
		 em.persist(item);
		 em.getTransaction().commit();
		 return item;
	}
	
	public List<WishItem> getWishItems(User user){
		  	EntityManager em = JpaUtil.createEntityManager();
		    Query q = em.createQuery("select w from WishItem w");
			@SuppressWarnings("unchecked")
			List<WishItem> wishItems = q.getResultList();
			em.close();
			return wishItems;
	}
}
