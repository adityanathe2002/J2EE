package com.library.Library_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.Library_app.dao.StudentsDao;
import com.library.Library_app.dto.Students;

@WebServlet(value = "/viewstud")
public class ViewStudentController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sidParam = req.getParameter("sid");
	    
	    if (sidParam != null && !sidParam.isEmpty()) {
	        try {
	            int sid = Integer.parseInt(sidParam);
	            
	            StudentsDao dao = new StudentsDao();
	            Students student = dao.findBySid(sid);
	            
	            if (student != null) {
	                req.setAttribute("Student", student);
	            } else {
	                req.setAttribute("message", "Student not found for SID: " + sid);
	            }
	            
	        } catch (NumberFormatException e) {
	            req.setAttribute("message", "Invalid SID format: " + sidParam);
	        }
	    } else {
	        req.setAttribute("message", "SID parameter is missing.");
	    }

	    RequestDispatcher rd = req.getRequestDispatcher("getStudent.jsp");
	    rd.forward(req, resp);
	}
}


