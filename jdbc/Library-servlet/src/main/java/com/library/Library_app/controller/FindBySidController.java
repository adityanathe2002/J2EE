package com.library.Library_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.StudentsDao;
import com.library.Library_app.dto.Students;


@WebServlet(value = "/findbysid")
public class FindBySidController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentsDao dao = new StudentsDao();
		Students student = dao.findBySid(Integer.parseInt(req.getParameter("sid")));
		req.setAttribute("student", student);
	   RequestDispatcher rd = req.getRequestDispatcher("StudentUpdate.jsp");
		rd.forward(req, resp);
	}
}


