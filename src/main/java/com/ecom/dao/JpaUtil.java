package com.ecom.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static final String PERSISTENCE_UNIT_NAME = "jpa-ecom";
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);;
	
	public static EntityManager createEntityManager(){
	    EntityManager em = factory.createEntityManager();
	    return em;
	}
}
