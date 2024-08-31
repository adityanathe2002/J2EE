package com.qsp.registration_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.registration_app.dao.studentDao;
import com.qsp.registration_app.dto.student;

@WebServlet(value = "/reg")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		studentDao  dao= new studentDao();
		student s=new student();
		s.setEmail(req.getParameter("m"));
		s.setName(req.getParameter("n"));
		s.setPhone(Long.parseLong(req.getParameter("p")));
		s.setCourse(req.getParameter("c"));
		s.setEducation(req.getParameter("e"));
		s.setStream(req.getParameter("s"));
		s.setYearsOfPass(Integer.parseInt(req.getParameter("y")));
		s.setGender(req.getParameter("g"));
		s.setFeesPaid(req.getParameter("fp"));
		dao.insert(s);
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Regestered......!</h1>");
		
		
	}

}
