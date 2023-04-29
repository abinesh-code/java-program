import java.util.*;

class Password {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Enter the  length of Password: ");
		int l = sc.nextInt();

		String a = "";
		
		String arr[] ={"0","1","2","3","4","5","6","7","8","9","q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};

		for(int i = 0; i < l; i++)
		{
			a +=arr[r.nextInt(35)];
		}

		System.out.println("Generated Password is: "+a);
	}
}