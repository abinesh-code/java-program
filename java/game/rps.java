import java.util.*;

public class rps {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		String arr[]={"rock","paper","sisor"};
		
		String n1="rock";
		String n2="paper";
		String n3="sisor";
		
		System.out.println("Type any one from this-->>"+" "+n1+" "+n2+" "+n3);
		String m=sc.nextLine();
		
		String q=arr[r.nextInt(3)];
		if(m.equals(q))
			System.out.println("Its a tie");
		else if((m.equals("rock") && q.equals("sisor")) || (m.equals("paper") && q.equals("rock")) || (m.equals("sisor") && q.equals("paper")))
			System.out.println("You win...!"+" machine choice is: "+q);
		else
			System.out.println("You lose...!"+" machine choice is: "+q);
	}
}
