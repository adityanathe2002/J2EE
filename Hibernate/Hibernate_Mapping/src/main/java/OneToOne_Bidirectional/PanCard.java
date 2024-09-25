package OneToOne_Bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {

	@Id
	private int id;
	private String location;
	@OneToOne(mappedBy="card")
	private Person1 person1;
	public PanCard() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Person1 getPerson1() {
		return person1;
	}
	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}
	
}
