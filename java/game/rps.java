import java.util.*;

public class rps {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		String arr[]={"rock","paper","scissor"};
		
		String n1="rock";
		String n2="paper";
		String n3="scissor";
		
		System.out.println("Type any one from this-->>"+" "+n1+" "+n2+" "+n3);
		String m=sc.nextLine();
		
		String q=arr[r.nextInt(3)];
		if(m.equals(q))
			System.out.println("Its a tie");
		
		else if((m.equals("rock") && q.equals("scissor")) || (m.equals("paper") && q.equals("rock")) || (m.equals("scissor") && q.equals("paper")))
			System.out.println("You win...!"+ " machine choice is: "+q);
		
		else if((q.equals("rock") && m.equals("scissor")) || (q.equals("paper") && m.equals("rock")) || (q.equals("scissor") && m.equals("paper")))
			System.out.println("You Lose...!" +" machine choice is: "+q);
		
		else
			System.out.println("Enter valid option");
	}
}
