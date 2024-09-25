package com.qsp.ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

//		Subject subject = em.find(Subject.class, 104);
	
		Student student = em.find(Student.class, 11);
					
		et.begin();
//		em.remove(subject);
		em.remove(student);
		et.commit();
		System.out.println("Deleted..!");
	}
}
