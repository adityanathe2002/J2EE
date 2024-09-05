package com.library.Library_app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.StudentsDao;
import com.library.Library_app.dto.Students;

@WebServlet(value="/getallstud")
public class ViewAllStudentController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentsDao dao=new StudentsDao();
		List<Students> student =dao.getAllStudent();
		req.setAttribute("list", student);
		RequestDispatcher rd=req.getRequestDispatcher("getAllStud.jsp");
		rd.forward(req, resp);
	}

}


