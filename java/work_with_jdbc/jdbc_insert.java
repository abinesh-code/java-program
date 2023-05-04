import java.sql.*;

public class jdbc_insert {

	public static void main(String[] args) throws Exception {

		// NOT NECCESSARY WHILE ALREADY JAR FILE LOADED
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		

		//INITAILIING VARIABLES

		String url = "jdbc:mysql://localhost:3306/Project";
		String uname = "root";
		String pass = "kali";
		String sql ="insert into login values(?,?)";

		//ESTABLISHING CONNECTION

		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connected");

		//PREPARING STATEMENT

		PreparedStatement st = con.prepareStatement(sql);

		//EXECUTING QUERY

		st.setString(1,"abinesh");
		st.setString(2,"kali");
		st.executeUpdate();

		st.setString(1,"deepi");
		st.setString(2,"abi");
		st.executeUpdate();

		System.out.println("Inserted...!");

		//CLOSSING THE CONNECTION

		con.close();
		st.close();
	}
}