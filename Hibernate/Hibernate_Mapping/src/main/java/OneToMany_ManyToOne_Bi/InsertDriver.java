package OneToMany_ManyToOne_Bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Product1 product=new Product1();
		product.setId(101);
		product.setName("iphone");
		product.setPrice(80000);
		
		Review1 review1=new Review1();
		review1.setId(10);
		review1.setMessage("good");
		review1.setProduct(product);
		
		Review1 review2=new Review1();
		review2.setId(11);
		review2.setMessage("Dabba");
		review2.setProduct(product);
		
		List<Review1>list=new ArrayList<Review1>();
		list.add(review1);
		list.add(review2);
		product.setReviews(list);
		
		et.begin();
		em.persist(product);
		em.persist(review1);
		em.persist(review2);
		et.commit();
		System.out.println("Saved.....!!!!!!");
	}
}
