package OneToMany_ManyToOne_Bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Product1 product1=em.find(Product1.class, 101);
		System.out.println("-------Product--------");
		System.out.println(product1.getId());
		System.out.println(product1.getName());
		System.out.println(product1.getPrice());
		
		System.out.println("-------Review--------");
		List<Review1>reviews1=product1.getReviews();
		for (Review1 review1 : reviews1) {
			System.out.println(review1.getId());
			System.out.println(review1.getMessage());
			System.out.println("--------------------");
		}
	}
}
