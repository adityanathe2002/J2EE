package com.library.Library_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/viewInfo")
public class ViewStudentInfoController extends HttpServlet{

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		HttpSession session = req.getSession(false);
        if (session.getAttribute("Students") != null) {
            RequestDispatcher rd = req.getRequestDispatcher("ViewStudentInfo.jsp");
            rd.forward(req, resp);
        } else {
//            resp.sendRedirect("StudentOpt.jsp");
//        	System.out.println("hello");
        	
        }
    }
}

