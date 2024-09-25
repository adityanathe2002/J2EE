package OneToOne_Bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person1 person1=em.find(Person1.class, 10);
		System.out.println("iD: "+person1.getId());
		System.out.println("Name: "+person1.getName());
		System.out.println("Phone: "+person1.getPhone());
		System.out.println("Pan Card: "+person1.getCard());
	}
}
