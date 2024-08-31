package com.library.view;

import java.util.Scanner;

import com.library.controller.LibraryController;
import com.library.model.Admin;
import com.library.model.Student;

public class LibraryView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isLoggedIn = false;
		System.out.println("***** Welcome *****");
		while(true)
		{
			if(!isLoggedIn)
			{
				System.out.println("1. Admin Login");
				System.out.println("2. Student login");
				System.out.println("3. Exit");
				System.out.println("Ente an option: ");

				switch (sc.nextInt()) {
				// Admin Login
				case 1: {
					Admin a = new Admin(null, null);
					System.out.print("Enter Id: ");
					String newId = sc.next();
					System.out.print("Enter Password: ");
					String newPass = sc.next();
					
					if (newId.equals(a.getAdminId()) && newPass.equals(a.getAdminPassword())) 
					{
						isLoggedIn=true;

					} else if (!newId.equals(a.getAdminId())) {
						System.out.println("Wrong Admin Id");
					} else {
						System.out.println("Wrong Password");
					}

				}
					break;
				// Student Interface
				case 2: {
					System.out.println("*** Welcome to Library***");
					System.out.println("1. Register");
					System.out.println("2. Login");
					System.out.println("3. Log Out");
					System.out.print("Enter an option: ");

					switch (sc.nextInt()) {
					// Student insert
					case 1: {
						Student s = new Student();
						System.out.print("Enter Name : ");
						s.setName(sc.next());
						System.out.print("Enter stream: ");
						s.setStream(sc.next());
						System.out.print("Enter Id: ");
						s.setSid(sc.nextInt());
						System.out.print("Enter Password: ");
						s.setsPassword(sc.nextInt());
						LibraryController.studentInsert(s);
						System.out.println("Inserted.....");
					}
						break;
					// Student Login
					case 2: {
						Student s = new Student();
						System.out.println("***Login***");
						System.out.print("Enter Sid: ");
						s.setSid(sc.nextInt());
						System.out.print("Enter Password: ");
						s.setsPassword(sc.nextInt());

					}
						break;
					// Log Out
					case 3: {

					}
					}
				}
					break;
				case 3: {

				}
				}
//				System.out.println("Enter y to continue");
			}
			else {
				System.out.println("**** Welcome ****");
                System.out.println("1. View Books List");
                System.out.println("2. Add Books");
                System.out.println("3. Remove Book");
                System.out.println("4. View Students");
                System.out.println("5. View Borrowed Book Details");
                System.out.println("6. Logout");
                System.out.println();
                System.out.print("Enter an Option: ");
                int option1 = sc.nextInt();
                System.out.println();
                switch (option1) 
                {
                    case 1:{
                    	
                    }
                        break;
                    case 2:{
                    	// Add books
                    	
                    } 
                        break;
                    case 3:{
                        
                    }
                    case 4:{
                    	
                    }      
                        break;
                    case 5:{
                    	
                    }
                         break;
                    case 6:
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
			}
		} //while ("Y".equalsIgnoreCase(sc.next()));
	}
}
