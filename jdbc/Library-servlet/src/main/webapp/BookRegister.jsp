<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #FAFAFA;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background-color: #FFFFFF;
            border: 1px solid #DBDBDB;
            padding: 20px;
            width: 300px;
            border-radius: 12px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #262626;
            font-size: 24px;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
        }
        td {
            padding: 10px 0;
        }
        input[type="text"],
        input[type="email"],
        input[type="number"],
        select {
            width: calc(100% - 22px);
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #DBDBDB;
            border-radius: 4px;
            font-size: 14px;
            background-color: #FAFAFA;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #3897F0;
            border: none;
            border-radius: 4px;
            color: #FFFFFF;
            font-weight: bold;
            cursor: pointer;
            font-size: 14px;
        }
        input[type="submit"]:hover {
            background-color: #307DF0;
        }
    </style>
</head>
<body>
<div class="form-container">
        <h2>Book Registration</h2>
        <form action="bookadd" >
            <table>
                 <tr>
                    <td>Book ID:</td>
                    <td><input type="number" name="bookid" required></td>
                </tr>
             
                <tr>
                    <td>Book Name:</td>
                    <td><input type="text" name="bookName" required></td>
                </tr>
               
               <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="Register">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>