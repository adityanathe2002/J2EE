package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatemnetEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
//			
			PreparedStatement pstm= con.prepareStatement("insert into student values(?,?,?)");
//			assign to value delimiter
			System.out.println("Enter id: ");
			pstm.setInt(1, sc.nextInt());
			System.out.println("Enter name: ");
			pstm.setString(2,sc.next());
			System.out.println("Enter number: ");
			pstm.setLong(3,sc.nextLong());
			
//			update
//			PreparedStatement pstm=con.prepareStatement("update student set name=? where sid=?");
//			System.out.println("Enter new name: ");
//			pstm.setString(1,sc.next());
//			System.out.println("enter id: ");
//			pstm.setInt(2, sc.nextInt());
//			System.out.println("Updated....!!");
			
//			delete the data
//			PreparedStatement pstm =con.prepareStatement("delete from student where sid =?");
//			System.out.println("enter id : ");
//			pstm.setInt(1,sc.nextInt());
//			System.out.println("Deleted....!");
			
			pstm.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
