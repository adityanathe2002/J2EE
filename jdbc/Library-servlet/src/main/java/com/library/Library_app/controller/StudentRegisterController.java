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

@WebServlet(value = "/registered")
public class StudentRegisterController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve form parameters
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("name");
		long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String degree = request.getParameter("degree");
		String stream = request.getParameter("stream");
		String addmisionDate = request.getParameter("addmisionDate");
		
		// Create a new Student object
		Students student = new Students();
		student.setSid(sid);
		student.setName(name);
		student.setPhone(phone);
		student.setEmail(email);
		student.setDegree(degree);
		student.setStream(stream);
		student.setAddmisionDate(addmisionDate);

		// Save the student using DAO
		StudentsDao studentDAO = new StudentsDao();
		studentDAO.addStudent(student);

//		RequestDispatcher rd = request.getRequestDispatcher("getAll");
//		rd.forward(request, response);
	}	

}
