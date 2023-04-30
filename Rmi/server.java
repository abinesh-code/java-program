import java.rmi.*;
import java.rmi.registry.*;

public class server {

	public static void main(String[] args) {
		
		try {


			Registry rr=LocateRegistry.createRegistry(5000);

			AddI r=new AddIm();

			rr.rebind("abinesh",r);

			System.out.println("server started..!");
		}
		catch(Exception e) {

			e.printStackTrace();
		}
	}
}