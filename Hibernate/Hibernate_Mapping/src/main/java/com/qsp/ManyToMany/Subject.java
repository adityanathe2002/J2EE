package com.qsp.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	private int id;
	private String name;
	private String trainer;
	public Subject() {
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
	
}
