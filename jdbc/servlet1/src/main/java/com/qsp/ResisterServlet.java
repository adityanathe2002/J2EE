package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=req.getParameter("un");
		String phone=req.getParameter("ph");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>user name="+user+"</h1>");
		pw.print("<h1>phone number="+phone+"</h1>");

	}

}
