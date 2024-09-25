package com.hibernate.fetchType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Car1Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car1 car=new Car1();
		car.setId(101);
		car.setName("Honda");
		car.setPrice(1000000);
		
		Engine1 engine1=new Engine1();
		engine1.setId(10);
		engine1.setName("Bosch");
		engine1.setCc("3000");
		
		car.setEngine(engine1);
		engine1.setCar(car);
		
		et.begin();
		em.persist(car);
		em.persist(engine1);
		et.commit();
		System.out.println("Saved...!s");
	}
}
