package com.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Admin admin = new Admin("admin", 123);

		List<String> booksList = new ArrayList<>(Arrays.asList("1. Atomic Habits", 
				"2. Agnipankh", 
				"3. The Missile Man",
				"4. Verbal English",
				"5. Rich Dad Poor Dad", 
				"6. Do Epic Shit Done", 
				"7. Ikigai",
				"8. Why Bharat Matters", 
				"9. Gaban", 
				"10. Think Like A Monk")
				);

		Library library = new Library(booksList);
		List<Student> students = new ArrayList<>();

		boolean isLoggedIn = false;
		Student currentStudent = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (!isLoggedIn) {
				System.out.println();
				System.out.println("*** Spider Library ***");
				System.out.println("1. Admin Login");
				System.out.println("2. Student Login");
				System.out.println("3. Exit");
				System.out.println();
				System.out.print("Enter Option: ");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.print("Enter Id: ");
					String newId = sc.next().toLowerCase();
					System.out.print("Enter Password: ");
					int newPassword = sc.nextInt();
					if (newId.equals(admin.adminId) && newPassword == admin.adminPassword) {
						isLoggedIn = true;
					} else if (!newId.equals(admin.adminId)) {
						System.out.println("Wrong Admin Id");
					} else {
						System.out.println("Wrong Password");
					}
					break;
				case 2:
					if (!isLoggedIn) {
						System.out.println("*** Welcome to the Library ***");
						System.out.println("1. Register");
						System.out.println("2. Login");
						System.out.println("3. Exit");
						System.out.print("Enter an option: ");
						int opt = sc.nextInt();

						switch (opt) {
						case 1:
							Student newStudent = registerStudent(sc, students);
							if (newStudent != null) {
								students.add(newStudent);
								System.out.println("Registration successful. You can now login.");
								break;
							} else {
								System.out.println("Registration failed. Please try again.");
							}
							break;
						case 2:
							System.out.print("Enter Student ID: ");
							int sID = sc.nextInt();
							System.out.print("Enter Student Password: ");
							int uPass = sc.nextInt();

							currentStudent = students.stream()
									.filter(stud -> stud.sid == sID && stud.sPassword == uPass).findFirst()
									.orElse(null);

							if (currentStudent != null) {
								currentStudent.displayStudent();
								isLoggedIn = true;
								while (true) {
									System.out.println();
									System.out.println("*** Library Menu ***");
									System.out.println("1. View Books List");
									System.out.println("2. Borrow a Book");
									System.out.println("3. Return a Book");
									System.out.println("4. View Borrowed Books");
									System.out.println("5. Logout");
									System.out.print("Enter an option: ");
									int studentOption = sc.nextInt();

									switch (studentOption) {
									case 1:
										library.displayBooks();
										break;
									case 2:
										if (currentStudent.borrowedBooks.size() >= booksList.size()) {
											System.out.println("You have already borrowed all available books.");
										} else {
											System.out.print("Enter the book number to borrow: ");
											int bookNum = sc.nextInt();
											if (bookNum >= 1 && bookNum <= booksList.size()) {
												currentStudent.borrowBook(booksList.get(bookNum - 1));
											} else {
												System.out.println("Invalid book option");
											}
										}
										break;
									case 3:
										System.out.print("Enter the book number to return: ");
										int returnBookNum = sc.nextInt();
										if (returnBookNum >= 1 && returnBookNum <= booksList.size()) {
											currentStudent.returnBook(booksList.get(returnBookNum - 1));
										} else {
											System.out.println("Invalid book option");
										}
										break;
									case 4:
										currentStudent.displayBorrowedBooks();
										break;
									case 5:
										isLoggedIn = false;
										currentStudent = null;
										break;
									default:
										System.out.println("Invalid Option");
									}

									if (!isLoggedIn) {
										break;
									}
								}
							} else {
								System.out.println("Wrong Student ID or Password");
							}
							break;
						case 3:
							System.out.println("Exiting...");
							sc.close();
							return;
						default:
							System.out.println("Invalid Option");
						}
					}
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Invalid Option");
				}
			} else {
				System.out.println();
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
				switch (option1) {
				case 1:
					library.displayBooks();
					break;
				case 2:
					System.out.print("Enter book name to add: ");
					sc.nextLine(); // consume newline
					String bookName = sc.nextLine();
					library.addBook(bookName);
					System.out.println("Book added successfully!");
					break;
				case 3: {
					System.out.print("Enter Book Number You want to Remove: ");
					int removeBookNum = sc.nextInt();
					library.removeBook(removeBookNum);
				}
				case 4:
					if (students.isEmpty()) {
						System.out.println("No student data available");
					} else {
						System.out.println("Viewing Students...");
						for (Student student : students) {
							student.displayStudent();
						}
					}
					break;
				case 5:
					boolean noBooksBorrowed = true;
					for (Student student : students) {
						if (!student.borrowedBooks.isEmpty()) {
							noBooksBorrowed = false;
							System.out.println("Borrowed Books for Student ID: " + student.sid);
							student.displayBorrowedBooks();
						}
					}
					if (noBooksBorrowed) {
						System.out.println("No books have been borrowed by any student.");
					}
					break;
				case 6:
					isLoggedIn = false;
					break;
				default:
					System.out.println("Invalid Option");
				}
			}
		}
	}

	// Method to register a new student
	private static Student registerStudent(Scanner sc, List<Student> students) {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Stream: ");
		String stream = sc.next();
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		System.out.print("Enter Password: ");
		int password = sc.nextInt();

		// Check if student ID already exists
		boolean exists = students.stream().anyMatch(stud -> stud.sid == id);
		if (exists) {
			System.out.println("Student ID already exists.");
			return null;
		} else {
			return new Student(name, stream, id, password);
		}
	}
}
