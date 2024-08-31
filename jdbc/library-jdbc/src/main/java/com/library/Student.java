package com.library;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
    String stream;
    int sid;
    int sPassword;
    List<String> borrowedBooks;

    Student(String name, String stream, int sid, int sPassword) 
    {
        this.name = name;
        this.stream = stream;
        this.sid = sid;
        this.sPassword = sPassword;
        this.borrowedBooks = new ArrayList<>();
    }

    // Student Details Display
    public void displayStudent() 
    {
        System.out.println();
        System.out.println("*** Student Info ***");
        System.out.println("Name : " + this.name);
        System.out.println("Stream : " + this.stream);
        System.out.println("Stud ID : " + this.sid);
        System.out.println();
    }

    // Borrow Books
    public void borrowBook(String book) 
    {
        borrowedBooks.add(book);
        System.out.println("Borrowed " + book);
    }

    // Student Return Borrowed Books
    public void returnBook(String book) 
    {
        if (borrowedBooks.remove(book)) 
        {
            System.out.println("Returned " + book);
        } 
        else 
        {
            System.out.println("You haven't borrowed this book.");
        }
    }

    // Display Borrowed Books
    public void displayBorrowedBooks() 
    {
        System.out.println("*** Borrowed Books ***");
        if (borrowedBooks.isEmpty()) 
        {
            System.out.println("No borrowed books.");
        } 
        else 
        {
            for (String book : borrowedBooks) 
            {
                System.out.println(book);
            }
        }
    }

}
