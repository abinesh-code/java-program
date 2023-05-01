<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>LOGIN</title>
</head>
<body>
	<div align="center">
		<h1>User Login</h1>
	</div>
	<div align="center">
		<form action="LoginServlet" method=post>
		Enter username:<input type="text" name="txtName"><br><br>
		Enter password:<input type="password" name="txtpwd"><br><br>
		<input type="submit" value="login"><br><br>
		</form>
		New user?<br><a href="signup.jsp"> signup</a>
	</div>
</body>
</html>