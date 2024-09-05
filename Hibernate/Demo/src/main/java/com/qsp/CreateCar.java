package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateCar {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=new Car();
		c.setId(1);
		c.setBrand("TATA");
		c.setPrice(999999);
		
		et.begin();
		em.persist(c);
		et.commit();
		System.out.println("Created.....");
	}

}
