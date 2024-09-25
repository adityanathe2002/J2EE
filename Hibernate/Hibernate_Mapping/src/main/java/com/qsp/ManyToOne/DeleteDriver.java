package com.qsp.ManyToOne;

import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.Adhar;
import com.qsp.Person;

public class DeleteDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Product p=em.find(Product.class, 1);
		Review r=em.find(Review.class, 1);
		
		et.begin();
		em.remove(r);
		et.commit();
		System.out.println("Deleted");
	}
}
