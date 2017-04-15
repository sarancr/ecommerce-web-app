package com.ecom.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecom.model.Product;

public class ProductDao {

    @SuppressWarnings("unchecked")
	public List<Product> getAllProducts(){
	    EntityManager em = JpaUtil.createEntityManager();
	    Query q = em.createQuery("select p from Product p");
		List<Product> products = q.getResultList();
		em.close();
		return products;
	}
    
	public Product getProduct(int productId){
	    EntityManager em = JpaUtil.createEntityManager();
	    Query q = em.createQuery("select p from Product p where p.productId = " + productId);
	    Product p = (Product) q.getSingleResult();
	    em.close();
		return p;
	}

}
