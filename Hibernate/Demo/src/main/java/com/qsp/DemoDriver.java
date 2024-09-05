package com.qsp;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoDriver {

	public static void main(String[] args) {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
			System.out.println(emf);
		
	}
}
