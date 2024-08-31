package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			1st step
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
//			2nd step
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			System.out.println("Connection is Done ");
//			3rd step
			Statement stm=con.createStatement();
			System.out.println("create Statement");
//			4th step
//			stm.execute("insert into dept values(,'',' ')");  //insert data
//			System.out.println("Executed...!");
			
			stm.execute("update emp set sal=150000 where id=3");
			System.out.println("updated...!");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
