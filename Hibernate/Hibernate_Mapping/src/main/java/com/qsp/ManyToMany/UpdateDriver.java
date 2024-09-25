package com.qsp.ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Student student=em.find(Student.class, 10);
//		student.setPhone(1818);
//		
//		Subject subject=em.find(Subject.class, 101);
//		subject.setTrainer("Shreekant Sir");

//		Subject subject1=em.find(Subject.class, 102);
//		subject1.setTrainer("RaviTeja Sir");
//		
//		Subject subject2=em.find(Subject.class, 103);
//		subject2.setTrainer("Prasad Sir");
		
		Subject subject2=em.find(Subject.class, 103);
		subject2.setName("JavaScript");
		
		et.begin();
//		em.merge(student);
//		em.merge(subject);
//		em.merge(subject1);
		em.merge(subject2);
		et.commit();
		System.out.println("Updated....!");
	}
}
