<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>Spring REST Demo</h2>
	
	<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
	<br><br>
	<!-- Create a link for convenient -->
	<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</body>
</html>