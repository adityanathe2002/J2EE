package com.library.Library_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.StudentsDao;

@WebServlet(value = "/deletestud")
public class StudentDeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentsDao dao = new StudentsDao();
		dao.deletBySid(Integer.parseInt(req.getParameter("sid")));
		
		RequestDispatcher rd = req.getRequestDispatcher("getAllStud");
		rd.forward(req, resp);
	}
}
	