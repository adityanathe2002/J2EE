package com.qsp.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
//		Review review=em.find(Review.class , 1);
//		Product product=review.getProduct();
//		System.out.println("**** Product*****");
//		System.out.println("ID : "+ product.getId());
//		System.out.println("NAME: "+product.getName());
//		System.out.println("PRICE: "+product.getPrice());
//		
//		System.out.println("****REVIEW****");
//		System.out.println("ID: "+ review.getId());
//		System.out.println("MESSAGE: "+review.getMessage());
//		System.out.println("RATING: "+review.getRating());
		
		Review review1=em.find(Review.class, 1);
		Review review2=em.find(Review.class, 2);
		Product product=review1.getProduct();
		System.out.println("**** Product*****");
		System.out.println("ID : "+ product.getId());
		System.out.println("NAME: "+product.getName());
		System.out.println("PRICE: "+product.getPrice());
	}
}
