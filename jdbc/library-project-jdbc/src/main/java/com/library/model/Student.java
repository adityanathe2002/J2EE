package com.library.model;

public class Student {

	private String name;
	private String stream;
	private int sid;
	private int sPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getsPassword() {
		return sPassword;
	}

	public void setsPassword(int sPassword) {
		this.sPassword = sPassword;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stream=" + stream + ", sid=" + sid + ", sPassword=" + sPassword + "]";
	}

}
