package Strings;

import java.util.*;

public class string1 {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println(name);

        // // length
        // System.out.println(name.length());

        // concatenation
        String firstname = "Sakshi";
        String lastname = "Kathe";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        printLetters(fullname);
    }
}
