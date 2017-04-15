package com.ecom.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.ecom.model.User;

public class UserDao {

	public void  createUser(User user){
		 EntityManager em = JpaUtil.createEntityManager();
		 em.getTransaction().begin();
		 em.persist(user);
		 em.getTransaction().commit();
		 em.close();
		 System.out.println("User created - userId = " + user.getUserId());
	}
  
	public User getUser(String username){
		  	EntityManager em = JpaUtil.createEntityManager();
		    Query q = em.createQuery("select o from User o where o.email = '" + username+"'");
		    User user = null;
			try {
				 user = (User) q.getSingleResult();
			 }catch(NoResultException e){
				System.out.println("Warn: No user exist on email - " + username);
			}finally{
				em.close();
			}

			return user;
	}
	

}
