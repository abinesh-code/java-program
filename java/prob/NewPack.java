package oop;

import java.text.MessageFormat;

public class NewPack {
    public static void main(String[] args) {
        String a = "hello";
        String b = "007";

        //System.out.println(String.format("hi %s vanakam to %d",a,b));
        System.out.println(MessageFormat.format("hi {0} vanakam to {1}",a,b));
    }
}
