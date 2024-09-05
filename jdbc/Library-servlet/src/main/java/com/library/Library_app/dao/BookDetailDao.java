package com.library.Library_app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.library.Library_app.dto.Library;
import com.library.Library_app.dto.Students;


public class BookDetailDao {

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
	public static void addBook(Library library) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into book values(?,?)");

			ps.setInt(1, library.getBookid());
			ps.setString(2, library.getBookName());
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// view books
	public List<Library> getAllBooks() {
		List<Library> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from book");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Library library = new Library();

				library.setBookid(rs.getInt("bookid"));
				library.setBookName(rs.getString("bookName"));

				list.add(library);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	// Delete Student
		public boolean deletByBookid(int bookid) {
			try {
				PreparedStatement ps = con.prepareStatement("delete from book where bookid=? ");
				ps.setInt(1, bookid);
				if (1 == ps.executeUpdate()) {
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}


}
