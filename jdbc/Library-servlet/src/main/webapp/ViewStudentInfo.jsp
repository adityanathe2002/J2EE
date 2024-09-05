<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #FAFAFA;
            color: #333;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
        }
        .container {
            width: 80%;
            max-width: 800px;
            background-color: #FFFFFF;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #DBDBDB;
        }
        th {
            background-color: #F5F5F5;
            color: #262626;
        }
        tr:hover {
            background-color: #F9F9F9;
        }
        .message {
            color: red;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .logout-button {
            background-color: #E74C3C;
            color: #FFFFFF;
            padding: 10px 15px;
            border-radius: 4px;
            text-decoration: none;
            font-weight: bold;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
        }
        .logout-button:hover {
            background-color: #C0392B;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Student Information</h2>
        
        <!-- Display message if there is an error or missing information -->
        <c:if test="${not empty message}">
            <div class="message">
                ${message}
            </div>
        </c:if>
        
        <!-- Display student details if available -->
        <c:choose>
            <c:when test="${not empty sessionScope.Students}">
                <table>
                    <tr>
                        <th>SID</th>
                        <td>${sessionScope.Student.sid}</td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td>${sessionScope.Student.name}</td>
                    </tr>
                    <tr>
                        <th>Phone</th>
                        <td>${sessionScope.Student.phone}</td>
                    </tr>
                    <tr>
                        <th>Email</th>
                        <td>${sessionScope.Student.email}</td>
                    </tr>
                    <tr>
                        <th>Degree</th>
                        <td>${sessionScope.Student.degree}</td>
                    </tr>
                    <tr>
                        <th>Stream</th>
                        <td>${sessionScope.Student.stream}</td>
                    </tr>
                    <tr>
                        <th>Admission Date</th>
                        <td>${sessionScope.Student.addmisionDate}</td>
                    </tr>
                </table>
            </c:when>
            <c:otherwise>
                <div class="message">
                    No student information available. Please <a href="StudentOpt.jsp">Back in</a>.
                </div>
            </c:otherwise>
        </c:choose>
        
        <!-- Logout button -->
       <!--  <p>
            <a href="logout" class="logout-button">Logout</a>
        </p>-->
    </div>
</body>
</html>



