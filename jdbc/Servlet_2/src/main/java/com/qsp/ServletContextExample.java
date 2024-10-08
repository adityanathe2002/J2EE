package com.qsp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/emp")
public class ServletContextExample extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext sc=getServletContext();
		Employee e = new Employee();
		e.setId(101);
		e.setName("Arjit Singh");
		e.setPhone(9876543210l);
		sc.setAttribute("e1", e);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("Shreya Ghoshal");
		e2.setPhone(8876543216l);
		sc.setAttribute("e2", e2);
	}

}
