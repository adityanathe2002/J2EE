package com.qsp.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int id;
	private String name;
	private double branch;
	public Bank() {
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
	public double getBranch() {
		return branch;
	}
	public void setBranch(double branch) {
		this.branch = branch;
	}
	
}
