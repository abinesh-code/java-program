import java.util.*;

class Password2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String arr = "0123456789qwertyuiopasdfghjklzxcvbnm";

		System.out.println("Enter the  length of Password: ");
		int l = sc.nextInt();

		String pass = "";

		for(int i = 0; i < l; i++)
			pass += arr.charAt(r.nextInt(36));

		System.out.println("Generated password is: "+pass);
	}
}
