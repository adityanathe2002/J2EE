package com.library.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.model.Admin;
import com.library.model.Library;
import com.library.model.Student;

public class LibraryController {

	static Connection con;
	static String url = "jdbc:postgresql://localhost:5432/library";
	static String user = "postgres";
	static String password = "root";
	static {
		try {
			// 1st step
			Class.forName("org.postgresql.Driver");
			// 2nd step
			con = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// Admin Insert
	public static void adminLogin(String un,String pass) {
		Admin admin=new Admin(pass, pass);
		try {
			// 3rd step
			PreparedStatement ps = con.prepareStatement("select * from admin where adminId=?, adminPassword=?");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("adminid"));
				System.out.println(rs.getString("adminpassword"));
			}
			// 4th step
			ps.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// insert student
	public static void studentInsert(Student s) {
		try {
			
			// 3rd step
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, s.getSid());
			ps.setString(2, s.getName());
			ps.setString(3, s.getStream());
			ps.setInt(4, s.getsPassword());
			// 4th step
			ps.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// student login
	public static void studentLogin(Student s) {
//		Student s=new Student();
		try {
			PreparedStatement ps = con.prepareStatement("Select sid=?,password=? from student where sid=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// view student
	public static void viewStudent(int sid) {
		Student s=new Student();
		try {
			PreparedStatement ps=con.prepareStatement("select * from student where sid=?");
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s.setSid(rs.getInt("sid"));
				s.setName(rs.getString("name"));
				s.setStream(rs.getString("stream"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// view books
	public static void viewBook(Library l) {

	}

	// Add books
	public static void addBook(Library l) {

	}

	// Remove Books
	public static void removeBook(Library l) {

	}

	// Borrowed Books
	public static void borrowedBook(Student s) {

	}

	// Return Books
	public static void returnBook(Student s) {

	}

	// View Borrowed Books
	public static void viewBoorrowedBook(Student s) {

	}

	// view All Borrowed Book
	public static void viewAllBorroweddBook(Library l) {

	}

}
