package com.library.Library_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.StudentsDao;

@WebServlet(value = "/loginstud")
public class StudentLoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int sid=Integer.parseInt(req.getParameter("sid"));
		Long phone=Long.parseLong(req.getParameter("phone"));
		StudentsDao dao= new StudentsDao();
		
		boolean res= dao.login(sid , phone);
		PrintWriter pw=resp.getWriter();
		if(res) {
			pw.print("<h1>Login succesfully in Library...!</h1>");
		}else {
			pw.print("<h1>Invalid Creadentitials...!</h1>");
		}
		RequestDispatcher rd = req.getRequestDispatcher("StudentOpt.jsp");
		rd.forward(req, resp);
	}

	

}
