package com.qsp.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student student1=new Student();
		student1.setId(10);
		student1.setName("virat");
		student1.setPhone(888);

		Student student2=new Student();
		student2.setId(11);
		student2.setName("rohit");
		student2.setPhone(999);
		
		Subject subject1=new Subject();
		subject1.setId(101);
		subject1.setName("java");
		subject1.setTrainer("Dinga");
		
		Subject subject2=new Subject();
		subject2.setId(102);
		subject2.setName("sql");
		subject2.setTrainer("rashmika");
		
		Subject subject3=new Subject();
		subject3.setId(103);
		subject3.setName("js");
		subject3.setTrainer("NANA");
		
		Subject subject4=new Subject();
		subject4.setId(104);
		subject4.setName("J2EE");
		subject4.setTrainer("Sandeep Sir");
		
		List<Subject>list1=new ArrayList<Subject>();
		list1.add(subject1);
		list1.add(subject2);
		student1.setSubject(list1);
		
		List<Subject>list2=new ArrayList<Subject>();
		list2.add(subject1);
		list2.add(subject2);
		list2.add(subject3);
		student2.setSubject(list2);
		
		
		
		et.begin();
//		em.persist(student1);
//		em.persist(student2);
//		em.persist(subject1);
//		em.persist(subject2);
//		em.persist(subject3);
//		em.persist(subject4);
		et.commit();
		System.out.println("Saved....!");
	}
}
