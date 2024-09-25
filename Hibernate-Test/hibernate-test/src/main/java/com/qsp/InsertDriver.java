package com.qsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country country=new Country();
		country.setId(1);
		country.setName("india");
		country.setPm("Narendra Modi");
		
		State state1 =new State();
		state1.setId(101);
		state1.setName("Maharashtra");
		state1.setCm("Eknath Shinde");
		state1.setCountry(country);
		
		State state2=new State();
		state2.setId(102);
		state2.setName("UttarPradesh");
		state2.setCm("Yogi Adityanath");
		state2.setCountry(country);
		
		List<State> list=new ArrayList<State>();
		list.add(state1);
		list.add(state2);
		country.setState(list);
		
		
		et.begin();
		em.persist(country);
		em.persist(state1);
		em.persist(state2);
		et.commit();
		System.out.println("Data inserted...!");
	}
}
