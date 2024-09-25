package ManyToMany_Bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student1 student1=new Student1();
		student1.setId(10);
		student1.setName("virat");
		student1.setPhone(888);
		
		Student1 student2=new Student1();
		student2.setId(11);
		student2.setName("Rohit");
		student2.setPhone(999);
		
		Subject1 subject1=new Subject1();
		subject1.setId(101);
		subject1.setName("Java");
		subject1.setTrainer("Shreekant sir");
		
		Subject1 subject2=new Subject1();
		subject2.setId(102);
		subject2.setName("sql");
		subject2.setTrainer("Ravi sir");
		
		Subject1 subject3=new Subject1();
		subject3.setId(103);
		subject3.setName("JS");
		subject3.setTrainer("Prasad sir");
		
		List<Student1>students=new ArrayList<Student1>();
		students.add(student1);
		students.add(student2);
	
		
		List<Subject1>subjects1=new ArrayList<Subject1>();
		subjects1.add(subject1);
		subjects1.add(subject2);
		subjects1.add(subject3);
		
		student1.setSubjects(subjects1);
		
		List<Subject1>subjects2=new  ArrayList<Subject1>();
		subjects2.add(subject1);
		subjects2.add(subject2);
		
		student2.setSubjects(subjects2);
		
		subject1.setStudents(students);
		subject2.setStudents(students);
		subject3.setStudents(students);
		
		et.begin();
		em.persist(student1);
		em.persist(student2);
		em.persist(subject1);
		em.persist(subject2);
		em.persist(subject3);
		et.commit();
		System.out.println("Saved");
	}
}
