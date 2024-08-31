package com.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Library {
	 List<String> booksList;
	 Connection con;

	    Library(List<String> booksList,Connection con) 
	    {
	        this.booksList = booksList;
	        this.Connection=Connection;
	    }

	    public void displayBooks() 
	    {
	        System.out.println("**** Books List ****");
	        for (String book : booksList) 
	        {
	            System.out.println(book);
	        }
	    }

	    public void addBook(String bookName) 
	    {
	        int bookNumber = booksList.size() + 1;
	        String bookEntry = bookNumber + ". " + bookName;
	        booksList.add(bookEntry);
	    }
	    public void removeBook(int bookNumber)
	    { 
	    	try(PreparedStatement stmt = con.prepareStatement("delete from books where bookId=? ")){
	    		stmt.setInt(1,bookNumber);
	    		stmt.executeUpdate();
	    		System.out.println("Book Removed Successfully!");
	    	}
	    	catch(SQLException e)
	    	{
	    		e.printStackTrace();
	    	}
	    	 	
	         if (bookNumber > 0 && bookNumber <= booksList.size()) 
	         {
	            booksList.remove(bookNumber - 1);
	            // Update the book numbers
	            for (int i = bookNumber - 1; i < booksList.size(); i++) 
	            {
	                String updatedBookEntry = (i + 1) + ". " + booksList.get(i).split("\\. ", 2)[1];
	                booksList.set(i, updatedBookEntry);
	            }
	            System.out.println("Book removed successfully!");
	        } 
	        else 
	        {
	            System.out.println("Invalid book number.");
	        }
	    }
}
