package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Country country=em.find(Country.class, 1);
		System.out.println(country.getId());
		System.out.println(country.getName());
		System.out.println(country.getPm());
		System.out.println();
		
		State state=em.find(State.class, 101);
		System.out.println(state.getId());
		System.out.println(state.getName());
		System.out.println(state.getCm());
		
		
		
		
	}
}
