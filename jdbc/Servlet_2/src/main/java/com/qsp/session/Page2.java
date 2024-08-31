package com.qsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/page2")
public class Page2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		Object n= session.getAttribute("name");
		Object p= session.getAttribute("password");
		PrintWriter pw=resp.getWriter();
		if(n != null) {
			pw.print("<h1>Hii " + n + " ur in page2</h1>");
		}else {
			pw.print("<h1>logout</h1>");
		}
	}
}
