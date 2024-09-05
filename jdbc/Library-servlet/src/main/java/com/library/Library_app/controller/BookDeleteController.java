package com.library.Library_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.BookDetailDao;


@WebServlet(value = "/deletebook")
public class BookDeleteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookDetailDao dao = new BookDetailDao();
		dao.deletByBookid(Integer.parseInt(req.getParameter("bookid")));
		
		RequestDispatcher rd = req.getRequestDispatcher("getallbook");
		rd.forward(req, resp);
	}
}
