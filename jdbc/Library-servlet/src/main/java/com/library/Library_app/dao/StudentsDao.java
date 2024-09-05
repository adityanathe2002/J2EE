package com.library.Library_app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.library.Library_app.dto.Students;

public class StudentsDao {

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

	// insert student
	public void addStudent(Students student) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");

			ps.setInt(1, student.getSid());
			ps.setString(2, student.getName());
			ps.setLong(3, student.getPhone());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getDegree());
			ps.setString(6, student.getStream());
			ps.setString(7, student.getAddmisionDate());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Delete Student
	public boolean deletBySid(int sid) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from student where sid=? ");
			ps.setInt(1, sid);
			if (1 == ps.executeUpdate()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// Display all Student
	public List<Students> getAllStudent() {
		List<Students> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Students student = new Students();

				student.setSid(rs.getInt("sid"));
				student.setName(rs.getString("name"));
				student.setPhone((rs.getLong("phone")));
				student.setEmail(rs.getString("email"));
				student.setDegree(rs.getString("degree"));
				student.setStream(rs.getString("stream"));
				student.setAddmisionDate(rs.getString("addmisionDate"));

				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// Method to find a student by sid
		public Students findBySid(int sid) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Students student = null;

			try {

				// SQL query to retrieve student details by sid
				String sql = "SELECT * FROM student WHERE sid = ?";

				// Prepare the statement
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, sid);

				// Execute the query
				rs = pstmt.executeQuery();

				// If a result is returned, create a Student object and populate it
				if (rs.next()) {
					student = new Students();

					student.setSid(rs.getInt("sid"));
					student.setName(rs.getString("name"));
					student.setPhone(rs.getLong("phone"));
					student.setEmail(rs.getString("email"));
					student.setDegree(rs.getString("degree"));
					student.setStream(rs.getString("stream"));
					student.setAddmisionDate(rs.getString("addmisionDate"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
		        // Close the resources
		        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
		        if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
		    }

			return student; // Returns the student object, or null if not found
		}
		
	// Update Student
	public boolean updateStudent(Students student) {
		boolean isUpdated = false;
		PreparedStatement pstmt = null;
		try {

			// SQL query to update student details
			String sql = "UPDATE student SET name = ?, phone = ?, email=?, degree = ?, stream = ?, addmisionDate = ?";

			// Prepare the statement
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setLong(2, student.getPhone());
			pstmt.setString(3, student.getEmail());
			pstmt.setString(4, student.getDegree());
			pstmt.setString(5, student.getStream());
			pstmt.setString(6, student.getAddmisionDate());

			// Execute the update
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return isUpdated;
	}

	// login
	public boolean login(int sid, long phone) {
		try {
			PreparedStatement ps = con.prepareStatement("Select * from student where sid=? and phone=?");
			ps.setInt(1, sid);
			ps.setLong(2, phone);
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
