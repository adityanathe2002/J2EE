package com.hibernate.fetchType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car1 {

	@Id
	private int id;
	private String name;
	private double price;
	@OneToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="car_engine")
	private Engine1 engine;
	public Car1() {
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
	public Engine1 getEngine() {
		return engine;
	}
	public void setEngine(Engine1 engine) {
		this.engine = engine;
	}
	
}
