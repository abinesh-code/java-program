import java.sql.*;

public class cursor {
	public static void get(ResultSet rs) throws Exception
	{
		System.out.println("Id"+" "+"Name"+" "+"Age");
		String id=rs.getString(1);
		String name=rs.getString(2);
		String age=rs.getString(3);
		System.out.println(id+"  "+name+"  "+age);
		System.out.println("----------------------");
		System.out.println("Moving cursor to next row");
		System.out.println("-----------------------");
	}
	public static void main(String []args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/Students";
		String uname="root";
		String pass="";
		String query="select * from Student";
		
		Connection con=null;
		con=DriverManager.getConnection(url,uname,pass);
		
		Statement st=null;
		st=con.createStatement();
		
		System.out.println("Id"+" "+"Name"+" "+"Age");
		
		ResultSet rs=st.executeQuery(query);

		rs.next();
		get(rs);
		
		rs.next();
		get(rs);
		
		rs.next();
		get(rs);
		
		con.close();
		st.close();
		rs.close();
	}

}
