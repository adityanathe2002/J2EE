package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDriver {
 
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country country=em.find(Country.class, 1);
		country.setPm("Dr.Manmohan Singh");
		
		et.begin();
		em.merge(country);
		et.commit();
		System.out.println("Updated..!");
	}
}
