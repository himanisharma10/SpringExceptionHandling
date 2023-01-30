<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="student" method="post">
		Student Name: <input type="text" name="studentName">
		<br> 
		Roll No (Integer Only): <input type="text" name="rollNo">
		<input type="submit" value="Submit">
	</form>
</body>
</html>