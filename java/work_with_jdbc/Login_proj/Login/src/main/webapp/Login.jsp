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
	final String sql = "select * from login where uname = ? and password = ?";
	final String n = request.getParameter("txtName");
	final String p = request.getParameter("txtpwd");
	
	Connection con = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	
	
		Class.forName(driver);
		con = DriverManager.getConnection(url,uname,pass);
		st = con.prepareStatement(sql);

		st.setString(1, n);
		st.setString(2, p);


		rs = st.executeQuery(); 

		if(rs.next()) {
			
			RequestDispatcher rd = request.getRequestDispatcher("Login_welcome.jsp");
			rd.forward(request, response);
		}
		else {
			
			RequestDispatcher rr = request.getRequestDispatcher("Login_failed.jsp");
			rr.forward(request, response);
		}
		
		
		con.close();
		st.close();
		rs.close();

	%>
</body>
</html>
