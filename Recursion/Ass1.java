//for a given integer array of size N you have to find all occurreces of a given element and print them.

package Recursion;

public class Ass1 {
    public static void allOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.println(i + " ");
        }
        allOccurrence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        allOccurrence(arr, 2, 0);
    }
}
