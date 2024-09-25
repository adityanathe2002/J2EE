package OneToOne_Bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person1 person2=new Person1();
		person2.setId(11);
		person2.setName("sai pallavi");
		person2.setPhone(999);
		
		PanCard card1=new PanCard();
		card1.setId(102);
		card1.setLocation("India");
		
		person2.setCard(card1);
		card1.setPerson1(person2);
		
		et.begin();
		em.persist(person2);
		em.persist(card1);
		et.commit();
		System.out.println("Inserted");
	}
}

