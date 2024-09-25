package com.qsp.OneToOneBid_Ex;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindCarDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		// Fetch by Id 
//		Car car=em.find(Car.class, 1);
//		System.out.println("Id: "+car.getId());
//		System.out.println("Brand: "+car.getBrand());
//		System.out.println("Price: "+car.getPrice());
//		
//		System.err.println("-------------------------");
//		
//		Engine engine=em.find(Engine.class, 1);
//		System.out.println("Id: "+engine.getId());
//		System.out.println("Cc: "+engine.getCc());
		
		
		// Fetch by all
		Query query =em.createQuery("Select s from  Car s");
		List<Car> car=query.getResultList();
		System.out.println("Cars List");
		for (Car car2 : car) {
			System.out.println(car2.getId());
			System.out.println(car2.getBrand());
			System.out.println(car2.getPrice());
			System.out.println("-----------------");
		}
		
		Query query1 =em.createQuery("Select e from  Engine e");
		List<Engine> engines=query1.getResultList();
		System.out.println("Engines List");
		for (Engine engine : engines) {
			System.out.println(engine.getId());
			System.out.println(engine.getCc());
			System.out.println("------------------------");
		}
	}
}
