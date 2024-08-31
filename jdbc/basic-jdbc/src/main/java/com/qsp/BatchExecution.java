package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecution {

	public static void main(String[] args) {
		// TODO Auto-genered method stub

		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			Statement stm=con.createStatement();
//			stm.addBatch("insert into Student values(9,'xyz')");
			stm.addBatch("update student set contact=34578 where sid=111");
//			stm.addBatch("delete from student where sid=19");
			stm.executeBatch();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
