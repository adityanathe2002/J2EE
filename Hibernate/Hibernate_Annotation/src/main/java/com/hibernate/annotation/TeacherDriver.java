package com.hibernate.annotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Teacher teacher=em.find(Teacher.class,111);
		teacher.setName("RaviTeja");		
		et.begin();
		em.merge(teacher);
		et.commit();
	}
}
