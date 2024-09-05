package com.library.Library_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.BookDetailDao;
import com.library.Library_app.dto.Library;

@WebServlet(value = "/bookadd")
public class BookAddController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String bookName = request.getParameter("bookName");
		
		// Create a new Student object
		Library library = new Library();
		library.setBookid(bookid);
		library.setBookName(bookName);

		// Save the student using DAO
		BookDetailDao bookDao = new BookDetailDao();
		bookDao.addBook(library);
		
		RequestDispatcher rd=request.getRequestDispatcher("getallbook");
		rd.forward(request, response);

	}
}
