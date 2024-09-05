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


@WebServlet(value = "/updatestud")
public class StudentUpdateController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		int sid =Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("name");
		long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String degree = request.getParameter("degree");
		String stream = request.getParameter("stream");
	    String addmisionDate = request.getParameter("addmisionDate");

		// Create Student object with updated details
		Students student = new Students();
		student.setSid(sid);
		student.setName(name);
		student.setPhone(phone);
		student.setEmail(email);
		student.setDegree(degree);
		student.setStream(stream);
		student.setAddmisionDate(addmisionDate);

		// Update student details in the database
		StudentsDao studentDAO = new StudentsDao();
		boolean isUpdated = studentDAO.updateStudent(student);
		RequestDispatcher rd = request.getRequestDispatcher("getallstud");
		rd.forward(request, resp);

	}
}
