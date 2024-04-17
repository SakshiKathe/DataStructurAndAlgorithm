//Determine if 2 Strings are anagrams of each other

package Strings;

import java.util.*;

public class Ass3 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // convert a string into lowercase for that we dont want to check is separately
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char array are same or identical then strings are anagram

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {

            // case when lengths are not equals
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
