<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! 
	public int add(int a, int b){
		return a+b;
	}
	%>
	<% int sum=add(5,7); %>
	<h1><%=sum %></h1>
	
	  <% 
	String name="xyz";
	int pass=123;
	if(name.equals("xyz") && pass==(123)){
		System.out.println("Login succesfully");
	}
	%> 
</body>
</html>