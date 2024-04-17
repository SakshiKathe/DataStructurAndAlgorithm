//for a given set of strings, print the largest string.

package Strings;

import java.util.*;

public class string6 {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana", "pomogranate" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}