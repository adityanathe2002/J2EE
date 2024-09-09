package com.qsp.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Product product=new Product();
		product.setId(1);
		product.setName("Marker");
		product.setPrice(20);
//		
		Review review1=new Review();
		review1.setId(3);
		review1.setMessage("Very Good");
		review1.setRating(4.5);
		
		Review review2=new Review();
		review2.setId(2);
		review2.setMessage("Alcoholic");
		review2.setRating(1.5);
		
		review1.setProduct(product);
		review2.setProduct(product);
		
		et.begin();
		em.persist(review1);
		em.persist(review2);
		em.persist(product);
		et.commit();
		System.out.println("Inserteded......!");
		
	}
}
