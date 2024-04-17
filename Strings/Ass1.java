//Count how many times lowercase vowels occureed in a string entered by the user

package Strings;

import java.util.*;

public class Ass1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Count of vowels is: " + count);
    }
}
