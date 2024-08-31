package com.qsp.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("un");
		String pass = req.getParameter("pass");

		if (user.equals("xyz") && pass.equals("123")) {
			RequestDispatcher rd = req.getRequestDispatcher("home1");
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>incorrect credentials</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
		}

	}

}
