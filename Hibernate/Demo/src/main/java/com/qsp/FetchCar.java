package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchCar {
 
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Car car=em.find(Car.class, 1);
		System.out.println(car.getId());
		System.out.println(car.getBrand());
		System.out.println(car.getPrice());
		
	}
}
