<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		int a = 10;
		System.out.println("a : " + a);
		
		String id = request.getParameter("id");
	%>
	
	<%	for(int i=0; i<3; i++){	%>
	
		<h1>Hello JSP</h1>
	
	<%	}	%>
	<h2><%= id %></h2>
</body>
</html>