<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-In</title>
</head>
<body>
	<div align="center">
		<h1>User Sign-up</h1>
	</div>
	<div align="center">
		<form action="SignupServlet" method=post>
		Enter username:<input type="text" name="txtName"><br><br>
		Enter password:<input type="password" name="txtpwd"><br><br>
		<input type="submit" value="sign-up"><br><br>
		</form>
		Old user?<a href="login.jsp"> click-here</a>
		</div>
</body>
</html>