import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;

public class Addc {

	public static void main(String[] args) {
		
		try {

			Scanner sc=new Scanner(System.in);

			Registry rr=LocateRegistry.getRegistry(5000);

			AddI r= (AddI) rr.lookup("abinesh");

			int a,b,n;
			do {

				System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Exit");
				System.out.println();
				System.out.println("Enter your choice:");
				n=sc.nextInt();

				switch(n) {

				case 1:
					System.out.println("Enter num1:");
					a=sc.nextInt();

					System.out.println("Enter num2:");
					b=sc.nextInt();

					System.out.println();
					System.out.println("Addition is: "+r.add(a,b));
					System.out.println();
					break;

				case 2:
					System.out.println("Enter num1:");
					a=sc.nextInt();

					System.out.println("Enter num2:");
					b=sc.nextInt();

					System.out.println();
					System.out.println("Subtraction is: "+r.sub(a,b));
					System.out.println();
					break;

				case 3:
					System.out.println("Enter num1:");
					a=sc.nextInt();

					System.out.println("Enter num2:");
					b=sc.nextInt();

					System.out.println();
					System.out.println("Multiplication is: "+r.mult(a,b));
					System.out.println();
					break;

				case 4:
					System.out.println("Enter number:");
					a=sc.nextInt();

					System.out.println("Enter the Divisor:");
					b=sc.nextInt();

					System.out.println();
					System.out.println("Division is: "+r.div(a,b));
					System.out.println();
					break;

				case 5:
					System.exit(0);
				}
			}

			while(true);
		}
		catch(Exception e) {

			e.printStackTrace();
		}
	}
}