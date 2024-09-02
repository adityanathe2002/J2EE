<%@page import="com.qsp.registration_app.dto.student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
</head>
<body>
    <h2>List of Students</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Email</th>
                <th>Name</th>
                <th>Phone</th>
                <th>Course</th>
                <th>Education</th>
                <th>Stream</th>
                <th>Year of Pass</th>
                <th>Gender</th>
                <th>Fees Paid</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<student> students = (List<student>) request.getAttribute("students");
            if (students != null && !students.isEmpty()) {
                for (student s : students) {
            %>
            <tr>
                <td><%= s.getEmail() %></td>
                <td><%= s.getName() %></td>
                <td><%= s.getPhone() %></td>
                <td><%= s.getCourse() %></td>
                <td><%= s.getEducation() %></td>
                <td><%= s.getStream() %></td>
                <td><%= s.getYearsOfPass() %></td>
                <td><%= s.getGender() %></td>
                <td><%= s.getFeesPaid() %></td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="9" style="text-align: center;">No students found.</td>
            </tr>
            <%
            }
            %>
        </tbody>
    </table>
</body>
</html>
