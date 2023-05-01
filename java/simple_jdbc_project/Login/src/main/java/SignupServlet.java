import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			PrintWriter out=response.getWriter();
			String url="jdbc:mysql://localhost:3306/abinesh";
			String uname="root";
			String pass="";
			String sql="insert into login values(?,?)";
			Connection con=null;
			con=DriverManager.getConnection(url,uname,pass);
			String n=request.getParameter("txtName");
			String p=request.getParameter("txtpwd");
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, n);
			st.setString(2, p);
			st.executeUpdate();
			out.println("Sign-up Success...!");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

