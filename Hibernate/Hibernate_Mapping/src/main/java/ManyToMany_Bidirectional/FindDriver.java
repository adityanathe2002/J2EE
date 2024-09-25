package ManyToMany_Bidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.ManyToMany.Student;

public class FindDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Student1 student1=em.find(Student1.class, 11);
		System.out.println("--------Student--------");
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.getPhone());
		
		List<Subject1>list=student1.getSubjects();
		for (Subject1 subject1 : list) {
			System.out.println("---------Subjects------------");
			System.out.println(subject1.getId());
			System.out.println(subject1.getName());
			System.out.println(subject1.getTrainer());
		}
	}
}
