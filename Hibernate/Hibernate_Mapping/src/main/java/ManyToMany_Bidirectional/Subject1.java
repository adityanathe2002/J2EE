package ManyToMany_Bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject1 {

	@Id
	private int id;
	private String name;
	private String trainer;
	@ManyToMany
	private List<Student1>students;
	public Subject1() {
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
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public List<Student1> getStudents() {
		return students;
	}
	public void setStudents(List<Student1> students) {
		this.students = students;
	}
	
}
