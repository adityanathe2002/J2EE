package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p= new Person();
		p.setId(1);
		p.setName("xyz");
		p.setPhone(999);
		
		Adhar a= new Adhar();
		a.setId(101);
		a.setName("xyz");
		a.setLocation("pune");
		
		p.setCard(a);
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		System.out.println("Inserted....");
	}
}
