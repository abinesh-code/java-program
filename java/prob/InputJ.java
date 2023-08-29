package oop;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputJ {
    public static void main(String[] args) throws IOException {

        double a ;
        System.out.println("Enter the number want to add");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String s = br.readLine();
        Number n = Double.parseDouble(s);
        a = n.doubleValue();

        System.out.println((int)a+2);
    }
}
