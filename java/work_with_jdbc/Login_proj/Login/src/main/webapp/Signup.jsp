<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
</head>
<body>
	<%
	final String driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/Project";
	final String uname = "root";
	final String pass = "kali";
	final String sql = "insert into login (uname,password) values (?,?)";
	final String n = request.getParameter("txtName");
	final String p = request.getParameter("txtpwd");
	
	Connection con = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	Statement st1 = null;
	
	
		Class.forName(driver);
		con = DriverManager.getConnection(url,uname,pass);
		st = con.prepareStatement(sql);
		
		st1 = con.createStatement();
		
		rs = st1.executeQuery("select uname from login where uname ='"+n+"'");
		
		if(rs.next()) {
			
			out.println("<center><h3>username already exist try another</h3></center>");
			out.println("<center><a href=Signup.html>click here</a></center>");
		}
		else {
			st.setString(1, n);
			st.setString(2, p);
		
			st.executeUpdate();
			
			out.println("<center><h1>Registered..!</h1></center>");
			out.println("<center><a href=Login.html>click here</a> to login</center>");
		}
		
		con.close();
		st.close();
		st1.close();
		rs.close();

	%>
</body>
</html>
