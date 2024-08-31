package com.library;

public class LibraryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
