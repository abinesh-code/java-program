import java.sql.*;

public class jdbc_select {

	public static void main(String[] args) throws Exception {

		// NOT NECCESSARY WHILE ALREADY JAR FILE LOADED
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		

		//INITAILIING VARIABLES

		String url = "jdbc:mysql://localhost:3306/Project";
		String uname = "root";
		String pass = "kali";
		String sql ="select * from login";

		//ESTABLISHING CONNECTION

		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connected");

		//PREPARING AND EXECUTING STATEMENT

		Statement st = con.createStatement();

		
		//RETRIVING DATA FROM TABLE
		
		ResultSet rs = st.executeQuery(sql);

		System.out.println("\n--------------");
		System.out.println("User"+"  "+"Password");
		System.out.println("--------------");
		
		while (rs.next()) {
			
			String name = rs.getString(1);
			String pas = rs.getString(2);

			System.out.println(name+"   "+ pas);
		}

		//CLOSSING THE CONNECTION

		con.close();
		st.close();
		rs.close();
	}
}