package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country country=em.find(Country.class, 1);
		List<State> state=country.getState();
		et.begin();
		em.remove(country);
		em.remove(state);
		et.commit();
		System.out.println("Deleted...!!!");
		
	}
}

