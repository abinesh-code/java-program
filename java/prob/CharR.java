import java.util.Random;
import java.util.Scanner;

public class CharR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char a[] = new char[10000];

        for(int i = 0;i<a.length;i++) {
            a[i] = (char) (i+'\u0000');
        }
        char re = a[r.nextInt(10000)];
        System.out.println(re);
    }
}
