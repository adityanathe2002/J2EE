package com.qsp.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Product product = em.find(Product.class, 1);
		Review review=em.find(Review.class,1);
		review.setMessage("Excellent");
		et.begin();
		em.merge(review);
		et.commit();
		System.out.println("Update..!");
	}
}