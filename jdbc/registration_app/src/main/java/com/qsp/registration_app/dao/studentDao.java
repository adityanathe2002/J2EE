package com.qsp.registration_app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.qsp.registration_app.dto.student;

public class studentDao {

	static Connection con;
	static String url = "jdbc:postgresql://localhost:5432/qsp";
	static String user = "postgres";
	static String password = "root";
	static {
		try {
			// 1st Step
			Class.forName("org.postgresql.Driver");
			// 2nd step
			con = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	// insert The Data
	public static void insert(student s) {

		try {
			// 3rd step
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
			// setting the value to delimiter
			ps.setString(1, s.getEmail());
			ps.setString(2, s.getName());
			ps.setLong(3, s.getPhone());
			ps.setString(4, s.getCourse());
			ps.setString(5, s.getEducation());
			ps.setString(6, s.getStream());
			ps.setInt(7, s.getYearsOfPass());
			ps.setString(8, s.getGender());
			ps.setString(9, s.getFeesPaid());

			// 4th step
			ps.executeUpdate();
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
	}

	// Fetching the data by Using Email
	public static student fetchByEmail(String email) {
		student s = new student();
		try {
			PreparedStatement ps = con.prepareStatement("Select * from student where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s.setEmail(rs.getString("email"));
				s.setName(rs.getString("name"));
				s.setPhone(rs.getLong("phone"));
				s.setCourse(rs.getString("course"));
				s.setEducation(rs.getString("education"));
				s.setStream(rs.getString("stream"));
				s.setYearsOfPass(rs.getInt("yearsOfPass"));
				s.setGender(rs.getString("gender"));
				s.setFeesPaid(rs.getString("feesPaid"));

			}
		} catch (SQLException el) {
			// TODO Auto-generated catch block
			el.printStackTrace();
		}
		return s;
	}

	// Fetch By All Data
	public static List<student> fetchByAll() {
		List<student> li = new ArrayList<student>();
		try {
			// 3rd step
			PreparedStatement ps = con.prepareStatement("select * from student ");
			// 4th step
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student stud = new student();
				stud.setEmail(rs.getString("eamil"));
				stud.setName(rs.getString("name"));
				stud.setPhone(rs.getLong("phone"));
				stud.setCourse(rs.getString("course"));
				stud.setEducation(rs.getString("education"));
				stud.setStream(rs.getString("straem"));
				stud.setYearsOfPass(rs.getInt("yearsOfPass"));
				stud.setGender(rs.getString("gender"));
				stud.setFeesPaid(rs.getString("feesPaid"));
				li.add(stud);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return li;
	}

	// Update by Name
	public static boolean updateByEmail(String email, String name) {
		student stud = fetchByEmail(email);
		if (stud.getName() != null) {
			// 3rd step
			try {
				PreparedStatement ps = con.prepareStatement("update student set name=? where email=?");
				ps.setString(1, name);
				ps.setString(2, email);
				// 4th step
				ps.executeUpdate();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	// update by Phone
	public static boolean updateByEmail(String email, long phone) {
		student stud = fetchByEmail(email);
		if (stud != null) {
			// 3rd step
			try {
				PreparedStatement ps = con.prepareStatement("update student set phone=? where email=?");
				ps.setLong(1, phone);
				ps.setString(2, email);
				// 4th step
				ps.executeUpdate();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	// Delete the data
	public static boolean deleteByEmail(String email) {
		student s = fetchByEmail(email);
		if (s.getName() != null) {
			try {
				// 3rd step
				PreparedStatement ps = con.prepareStatement("delete from student where email=?");
				ps.setString(1, email);
				ps.executeUpdate();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			return true;

		} else {
			return false;
		}
	}

	// Close Connection
	public static void closeConnection() {
		try {
			// 5th step
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	// login
	public boolean login(String email, long phone) {
		try {
			PreparedStatement ps=con.prepareStatement("Select * from student where email=? and phone=?");
			ps.setString(1, email);
			ps.setLong(2, phone);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.err.println("**** Welcome ****");
//		do {
//			System.out.println("1. Insert Student");
//			System.out.println("2. Fetch Student By Email");
//			System.out.println("3. Fetch All Student");
//			System.out.println("4. Update Student Name By Email");
//			System.out.println("5. Upadate Student Phone By Email");
//			System.out.println("6. Delete Student By Email");
//			System.out.println("7. Close Connetion");
//			System.out.println("");
//			System.out.println("Enter an Option: ");
//
//			switch (sc.nextInt()) {
//			case 1: {
//				// Insert Data
//				student s = new student();
//				System.out.println("Enter Email: ");
//				s.setEmail(sc.next());
//				System.out.println("Enter Name: ");
//				s.setName(sc.next());
//				System.out.println("Enter Phone: ");
//				s.setPhone(sc.nextLong());
//				System.out.println("Enter Course: ");
//				s.setCourse(sc.next());
//				System.out.println("Enter Education: ");
//				s.setEducation(sc.next());
//				System.out.println("Enter Stream: ");
//				s.setStream(sc.next());
//				System.out.println("Enter Year Of Pass: ");
//				s.setYearsOfPass(sc.nextInt());
//				System.out.println("Enter Gender: ");
//				s.setGender(sc.next());
//				System.out.println("Enter FeesPaid: ");
//				s.setFeesPaid(sc.next());
//				studentDao.insert(s);
//				System.out.println("inserted");
//
//			}
//				break;
//			case 2: {
//				// Fetch Student by Email
//				System.out.println("Enter Email: ");
//				student s= studentDao.fetchByEmail(sc.next());
//				System.out.println(s);
//
//			}
//				break;
//			case 3: {
//				// Fetch All Student
//				List<student> li =studentDao.fetchByAll();
//				for (student s : li) {
//					System.out.println(s);
//				}
//
//			}
//				break;
//			case 4: {
//				// Update Name
//				System.out.println("Enter Email: ");
//				String email = sc.next();
//				System.out.println("Enter New Name: ");
//				String newName = sc.next();
//				boolean b = studentDao.updateByEmail(email, newName);
//				if (b) {
//					System.out.println("Updated----");
//				} else {
//					System.out.println("Email is not present");
//				}
//			}
//				break;
//			case 5: {
//				// Update Phone
//				System.out.println("Enter Email: ");
//				String email = sc.next();
//				System.out.println("Enter New Phone: ");
//				long newPhone = sc.nextLong();
//				boolean b = studentDao.updateByEmail(email, newPhone);
//				if (b) {
//					System.out.println("Updated----");
//				} else {
//					System.out.println("Email is not present");
//				}
//
//			}
//				break;
//			case 6: {
//				// Delete 
//				System.out.println("Enter Email");
//				boolean b = studentDao.deleteByEmail(sc.next());
//				if (b) {
//					System.out.println("deleted.....");
//				} else {
//					System.out.println("is not in present");
//				}
//
//			}
//				break;
//			case 7: {
//				// Close Connection
//				studentDao.closeConnection();
//				System.out.println("Connection is closed.....");
//			}
//			default:System.out.println("Wrong Info");
//			}
//			System.out.println("Enter Y to Continue");
//		} while ("Y".equalsIgnoreCase(sc.next()));
//
	}

}