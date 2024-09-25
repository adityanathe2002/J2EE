package OneToMany_ManyToOne_Bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review1 {

	@Id
	private int id;
	private String message;
	@ManyToOne
	@JoinColumn(name="p_id")
	private Product1 product;
	public Review1() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Product1 getProduct() {
		return product;
	}
	public void setProduct(Product1 product) {
		this.product = product;
	}
	
}
