import java.util.*;

public class minmax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int n,a,min,max;
		
		do {
			System.out.println("1) Push\n2) Min\n3) Max\n4) Display element\n5) Extit");
		
		n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				
				System.out.println("Enter the element to add");
				a=sc.nextInt();
			    arr.add(a);
			    break;	
			}
			case 2:
			{
				min=Collections.min(arr);
				System.out.println("minimum is: "+min);
				break;
	   	}
	   	case 3:
	   	{
	   		max=Collections.max(arr);
	   		System.out.println("maximum is:"+max);
	   		break;
	   	}
	   	case 4:
	   	{
	   		System.out.println(arr);
	   		break;
	   	}
	   	case 5:
	   	  System.exit(0);
		}
		}
		while(true);
	}
}
