package com.library.Library_app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {

	private static final String URL = "jdbc:postgresql://localhost:5432/library";
	private static final String USER = "postgres";
	private static final String PASSWORD = "root";
	static Connection con;
	static {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean adminLogin(String adminid, String adminpassword) {
		try {
			PreparedStatement ps = con.prepareStatement("Select * from admin where adminid=? and adminpassword=?");
			ps.setString(1, adminid);
			ps.setString(2, adminpassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
