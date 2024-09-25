package com.qsp.OneToOneBid_Ex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistCarDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car car=new Car();
		car.setBrand("Mahendra");
		car.setPrice(1200000);
		
		Engine engine=new Engine();
		engine.setCc("1200 CC");
		
		car.setEngine(engine);
		engine.setCar(car);
		
		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		System.out.println("Saved..");
	}
	
}
