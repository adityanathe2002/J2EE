package com.qsp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/obj")
public class FetchObject extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc= getServletContext();
		Object o= sc.getAttribute("e1");
		Employee e1=(Employee)o;
		System.out.println(e1);
		Object o2= sc.getAttribute("e2");
		Employee e2=(Employee)o2;
		System.out.println(e2);
	}
}
