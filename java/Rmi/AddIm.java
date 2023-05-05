import java.rmi.*;
import java.rmi.server.*;

public class AddIm extends UnicastRemoteObject implements AddI {

	public AddIm() throws RemoteException {

		super();
	}
	public double add(double x,double y) {

		return x+y;
	}

	public double sub(double x,double y) {

		return x-y;
	}

	public double mult(double x,double y) {

		return x*y;
	}

	public double div(double x,double y) {

		return x/y;
	}
}