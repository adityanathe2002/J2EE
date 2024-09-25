package com.hibernate.fetchType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine1 {

	@Id
	private int id;
	private String name;
	private String cc;
	@OneToOne(fetch = FetchType.LAZY)
	
	private Car1 car;
	public Engine1() {
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
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public Car1 getCar() {
		return car;
	}
	public void setCar(Car1 car) {
		this.car = car;
	}
	
}
