package com.library.model;

public class Admin {

	private String adminId;
	private String adminPassword;
	public Admin(String adminId,String adminPassword){
		this.adminId="admin";
		this.adminPassword="admin";
	}
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + "]";
	}
	
}
