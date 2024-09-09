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
		
		Person p=em.find(Person.class, 1);
		p.setName("abc");
		
		Adhar a=p.getCard();
		a.setName("abc");
		et.begin();
		em.merge(p);
		em.merge(a);
		et.commit();
		System.out.println("Updated...");
				
	}
}
