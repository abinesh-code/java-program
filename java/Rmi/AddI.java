import java.rmi.*;

public interface AddI extends Remote {

	public double add(double x,double y) throws RemoteException;

	public double sub(double x,double y) throws RemoteException;

	public double mult(double x,double y) throws RemoteException;

	public double div(double x,double y) throws RemoteException;
	
}