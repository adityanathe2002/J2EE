package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPhone());
		
		Adhar card=p.getCard();
		System.out.println(card.getId());
		System.out.println(card.getName());
		System.out.println(card.getLocation());
	}
}
