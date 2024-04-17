package Arrays;

import java.util.*;
import java.util.Scanner;

public class Array_creation {
    public static void main(String[] args) {
        int marks[] = new int[50];

        System.out.println("length of arrays:" + marks.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics,chemistry and maths:");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

        // // update
        // marks[2] = 100;
        // System.out.println("Maths: " + marks[2]);

        // marks[1] = marks[1] + 1;
        // System.out.println("Chemistry: " + marks[1]);
    }
}