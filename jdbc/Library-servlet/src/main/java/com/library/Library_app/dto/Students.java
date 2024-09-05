package com.library.Library_app.dto;

public class Students {
	private int sid;
	private String name;
	private long phone;
	private String email;
	private String degree;
	private String stream;
	private String addmisionDate;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getAddmisionDate() {
		return addmisionDate;
	}
	public void setAddmisionDate(String addmisionDate) {
		this.addmisionDate = addmisionDate;
	}
}
