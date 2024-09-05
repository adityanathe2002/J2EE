package com.library.Library_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.AdminDao;



@WebServlet(value = "/adminlogin")
public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String adminid = req.getParameter("adminid");
		String adminpassword = req.getParameter("adminpassword");
		AdminDao dao = new AdminDao();

		boolean res = dao.adminLogin(adminid, adminpassword);
		PrintWriter pw = resp.getWriter();
		if (res) {
			pw.print("<h1> Admiin Login succesfully in Library...!</h1>");
		} else {
			pw.print("<h1>Invalid Creadentitials...!</h1>");
		}
		
		
		
		RequestDispatcher rd = req.getRequestDispatcher("AdminOpt.jsp");
		rd.forward(req, resp);
	}
}
