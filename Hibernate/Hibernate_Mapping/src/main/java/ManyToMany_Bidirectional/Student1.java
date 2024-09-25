package ManyToMany_Bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Student1 {

	@Id
	private int id;
	private String name;
	private long phone;
	@ManyToMany (mappedBy="students")
	private List<Subject1>subjects;
	public Student1() {
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Subject1> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject1> subjects) {
		this.subjects = subjects;
	}
	
}
