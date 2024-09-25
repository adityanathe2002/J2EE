package com.hibernate.AutoId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bus bus=new Bus();
		bus.setBrand("TATA");
		bus.setBusNo("MH15 bG 9999");
		bus.setPassengerCap(45);
		
		
		et.begin();
		em.persist(bus);
		et.commit();
		System.out.println("Saved...!");
	}
}
