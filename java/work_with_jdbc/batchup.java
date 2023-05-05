import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class batchup {
	public static void main(String []args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/Students";
		String uname="root";
		String pass="";
		
		Connection con=null;
		con=DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Connection succseed");
		
		Statement st=null;
		st=con.createStatement();
		
		String query1="insert into Student (Id,Name,Age) values(4,'ram',17)";
		String query2="insert into Student (Id,Name,Age) values(5,'guna',18)";
		String query3="insert into Student (Id,Name,Age) values(6,'love',19)";
		String query4="insert into Student (Id,Name,Age) values(7,'yow',20)";
		
		con.setAutoCommit(false);
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		
		st.executeBatch();

		con.commit();

		System.out.println("Batch update success");
		
		con.close();
		st.close();
		
		
	}

}
