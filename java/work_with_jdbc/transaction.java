import java.sql.*;

public class transaction
{
	public static void main(String []args)
	{
		try
		{
			//ESTABLISHING CONNECTION
			String url="jdbc:mysql://localhost:3306/Project";
			String uname="root";
			String pass="kali";
			
			Connection con=null;
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection is Success");
			
			//INVOKING TRANSACTION 
			con.setAutoCommit(false);
			try
			{
				
				String sql="insert into login (uname,password) values(?,?)";
				
				PreparedStatement st=null;
				
				//EXECUTING INSERT STATEMENT
				st=con.prepareStatement(sql);
				
				st.setString(1, "raj");
				st.setString(2, "steve");
				st.executeUpdate();
				
				st.setString(1, "ram");
				st.setString(2,"john");
				st.executeUpdate();
				
				System.out.println("INSERT Executed");
				
				//EXECUTING DELETE STATEMENT
				String sql1="delete from Student where uname=?";
				
				PreparedStatement st1=null;
				st1=con.prepareStatement(sql1);
				
				st1.setInt(1, "raj");
				st1.executeUpdate();
				
				st1.setInt(1, "ram");
				st1.executeUpdate();
				
				System.out.println("Delete success");
				
				//SETTING COMMIT
				con.commit();
				
				System.out.println("\n-------------------");
				System.out.println("Transaction success");
				System.out.println("-------------------");
			}
			catch(Exception e)
			{
				//IF TRANSACTION IS UNSUCCESSFULL 
				if(con !=null)
				{
					try
					{
						System.out.println("Connection is Rollbacked");
						con.rollback();
					}
					catch(SQLException ex)
					{
						ex.printStackTrace();
					}
				}
			}
		}
		catch(Exception ee)
		{
			//
		}
	}

}
