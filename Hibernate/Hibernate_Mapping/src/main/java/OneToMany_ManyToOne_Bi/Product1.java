package OneToMany_ManyToOne_Bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product1 {

	@Id
	private int id;
	private String name;
	private double price;
	@OneToMany(mappedBy = "product")
	private List<Review1>reviews;
	public Product1() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Review1> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review1> reviews) {
		this.reviews = reviews;
	}
}
