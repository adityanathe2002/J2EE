package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			1st step
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
//			2nd step
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			System.out.println("Connection is Done ");
			
			//3rd step
			Statement stm=con.createStatement();
			System.out.println("Statement is created");
			
//			4th step
//			insert data
//			stm.execute("insert into student values( 3,'lalu',6364)");
//			System.out.println("excuted...!");
			
//			fetch the data 
			stm.execute("Select name,dname from emp join dept on emp.id=dept.id where dept.id =3");
			ResultSet rs =stm.getResultSet();
			while(rs.next())
			{
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				System.out.println(rs.getString(1)+" "+rs.getString(1));
			}
//			update data
//			stm.execute("update student set name='lali' where sid=103");
//			System.out.println("update data");
			
//			delete data
//			stm.execute("delete from student where sid=103");
//			System.err.println("delete data ");
			
//			5th step
			con.close();	
			System.out.println("Connection Closed");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
