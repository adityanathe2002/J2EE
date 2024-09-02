//package com.qsp.registration_app.controller;
//
//import java.io.IOException;
////import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.qsp.reg_app.dao.StudentDao;
//import com.qsp.reg_app.dto.Student;
//import com.qsp.registration_app.dao.studentDao;
//import com.qsp.registration_app.dto.student;
//
//@WebServlet(value = "/fetchstudent")
//public class StudentFetchServlet extends HttpServlet {
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		List<student> students = studentDao.fetchByAll();
//		req.setAttribute("students", students);
//		RequestDispatcher dispatcher = req.getRequestDispatcher("studentList.jsp");
//		dispatcher.forward(req, resp);
//
//		studentDao dao=new studentDao();
//		List<student> students =dao.fetchByAll();
//		req.setAttribute("list", students);
//		RequestDispatcher rd=req.getRequestDispatcher("studentlist.jsp");
//		rd.forward(req, resp);
//	}
//}
