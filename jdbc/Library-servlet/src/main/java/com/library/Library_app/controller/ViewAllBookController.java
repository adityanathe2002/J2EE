package com.library.Library_app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.BookDetailDao;
import com.library.Library_app.dao.StudentsDao;
import com.library.Library_app.dto.Library;
import com.library.Library_app.dto.Students;

@WebServlet(value = "/getallbook")
public class ViewAllBookController extends HttpServlet{

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookDetailDao dao=new BookDetailDao();
		List<Library> library =dao.getAllBooks();
		req.setAttribute("list", library);
		RequestDispatcher rd=req.getRequestDispatcher("getAllBook.jsp");
		rd.forward(req, resp);
	}

}
