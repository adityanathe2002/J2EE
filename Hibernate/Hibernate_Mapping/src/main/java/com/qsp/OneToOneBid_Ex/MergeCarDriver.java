package com.qsp.OneToOneBid_Ex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MergeCarDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car car=em.find(Car.class, 1);
		car.setPrice(100000);
		
		Engine engine=em.find(Engine.class, 1);
		engine.setCc("1000 CC");
		
		et.begin();
		em.merge(car);
		em.merge(engine);
		et.commit();
		System.out.println("Updated....!!!");
	}
}
