<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student List</title>
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
        table {
            width: 80%;
            border-collapse: collapse;
            margin-bottom: 20px;
            background-color: #FFFFFF;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
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
        .action-buttons {
            display: flex;
            gap: 10px;
        }
        .action-buttons a {
            background-color: #3897F0;
            color: #FFFFFF;
            padding: 8px 12px;
            border-radius: 4px;
            text-decoration: none;
            font-weight: bold;
            text-align: center;
            display: inline-block;
            width: 60px;
        }
        .action-buttons a.delete {
            background-color: #E74C3C;
        }
        .action-buttons a:hover {
            background-color: #307DF0;
        }
        .action-buttons a.delete:hover {
            background-color: #C0392B;
        }
        .add-button {
            background-color: #3897F0;
            color: #FFFFFF;
            padding: 10px 15px;
            border-radius: 4px;
            text-decoration: none;
            font-weight: bold;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
        }
        .add-button:hover {
            background-color: #307DF0;
        }
        .message {
            color: red;
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>Student List</h2>

    <c:choose>
        <c:when test="${Student != null}">
            <table>
                <tr>
                    <th>SID</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Degree</th>
                    <th>Stream</th>
                    <th>Admission Date</th>
                    <th>Actions</th>
                </tr>
                <tr>
                    <td>${Student.sid}</td>
                    <td>${Student.name}</td>
                    <td>${Student.phone}</td>
                    <td>${Student.email}</td>
                    <td>${Student.degree}</td>
                    <td>${Student.stream}</td>
                    <td>${Student.addmisionDate}</td>
                    <td>
                        <div class="action-buttons">
                            <a href="findbysid?sid=${Student.sid}">Edit</a> 
                            <a href="deletestud?sid=${Student.sid}" class="delete">Delete</a>
                        </div>
                    </td>
                </tr>
            </table>
        </c:when>
        <c:otherwise>
            <div class="message">No student found with the provided ID.</div>
        </c:otherwise>
    </c:choose>
</body>
</html>
