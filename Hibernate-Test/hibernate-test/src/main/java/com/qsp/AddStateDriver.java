package com.qsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddStateDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country country=em.find(Country.class,1);
		
		
		State state3=new State();
		state3.setId(104);
		state3.setName("Gujrat");
		state3.setCm("Anand Kejriwal");
		state3.setCountry(country);
		
		List<State> list =new  ArrayList<State>();
		list.add(state3);
		country.setState(list);
		
		et.begin();
		em.persist(country);
		em.persist(state3);
		et.commit();
		System.out.println("State Added...!");
	}
}
