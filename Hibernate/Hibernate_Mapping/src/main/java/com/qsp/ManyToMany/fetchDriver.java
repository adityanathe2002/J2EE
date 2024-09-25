package com.qsp.ManyToMany;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class fetchDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		// Fetch one student
//		Student student=em.find(Student.class,10);
//		System.out.println("******** Student***********");
//		System.out.println("ID: "+student.getId());
//		System.out.println("Name: "+student.getName());
//		System.out.println("Phone: "+student.getPhone());
//		System.out.println();
//		System.out.println("********Subject***********");
//		List<Subject> subjects=student.getSubject();
//		for (Subject subject : subjects) {
//			System.out.println("ID: "+subject.getId());
//			System.out.println("Name: "+subject.getName());
//			System.out.println("Trainer: "+subject.getTrainer());
//			System.out.println();
//		}
		
		// Fetchb all student
		
		Query query=em.createQuery("Select s from Student s");
		List<Student>students=query.getResultList();
		for (Student student : students) {
			System.out.println("ID: "+student.getId());
			System.out.println("Name: "+student.getName());
			System.out.println("Phone: "+student.getPhone());
			System.out.println();
		}
//		
		// Fetch ALl Subject
		Query query1=em.createQuery("Select s from Subject s");
		List<Subject> subjects=query1.getResultList();
		for (Subject subject : subjects) {
			System.out.println("ID: "+subject.getId());
			System.out.println("Name: "+subject.getName());
			System.out.println("Trainer: "+subject.getTrainer());
			System.out.println();
		}
		
	}
}





