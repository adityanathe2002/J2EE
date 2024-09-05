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
	flex-direction: column;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.main-col {
	display: flex;
}

h2 {
	color: #262626;
	font-size: 36px;
	margin-bottom: 20px;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.1);
}

a {
	background-color: #3897F0;
	color: #FFFFFF;
	padding: 12px 20px;
	border-radius: 30px;
	text-decoration: none;
	font-weight: bold;
	box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
	transition: background-color 0.3s ease, transform 0.3s ease;
}

a:hover {
	background-color: #307DF0;
	transform: translateY(-3px);
}

a:active {
	transform: translateY(0px);
	box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.2);
}

.container {
	text-align: center;
	background-color: #FFF;
	padding: 40px;
	border-radius: 12px;
	box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
	max-width: 400px;
	margin-left: 20px;
}
</style>
</head>
<body>
	<div class="main-col">
		<div class="container">
			<h2>View Student</h2>
			<a href="getallstud">click here</a>
		</div>
		<div class="container">
			<h2>Update Student</h2>
			<a href="StudentUpdate.jsp">click here</a>
		</div>
		
		
		<div class="container">
			<h2>Find Student</h2>
			<a href="findStudent.jsp">click here</a>
		</div>
	</div><br>
	<div class="main-col">
		
		<div class="container">
			<h2>View Books</h2>
			<a href="getallbook">click here</a>
		</div>
		<div class="container">
			<h2>Add Books</h2>
			<a href="BookRegister.jsp">click here</a>
		</div>
		
	</div>

</body>
</html>