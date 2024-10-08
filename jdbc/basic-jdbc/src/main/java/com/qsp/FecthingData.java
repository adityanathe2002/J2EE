package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FecthingData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		fetching all the data from the table  using PreparedStatement with prepareStatement();
//		try {
//			Class.forName("org.postgresql.Driver");
//			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
//			PreparedStatement pstm=con.prepareStatement("select * from student");
//			ResultSet rs=pstm.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getInt("sid"));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getLong("contact"));
//				System.out.println("______________________________");
//			}
//			con.close();
			
			
//			fetching  the data from the table  using sid dynamic execution
			try {
				Class.forName("org.postgresql.Driver");
				Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
				PreparedStatement pstm=con.prepareStatement("select * from student where sid=?");
				
				System.out.println("enter sid: ");
				pstm.setInt(1, sc.nextInt());
				ResultSet rs=pstm.executeQuery();
				while(rs.next())
					{
						System.out.println(rs.getInt("sid"));
						System.out.println(rs.getString("name"));
						System.out.println(rs.getLong("contact"));
						System.out.println("______________________________");
					}
				
				con.close();
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
