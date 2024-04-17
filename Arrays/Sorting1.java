package Arrays;
//BUBBLE SORT

// import java.util.*;

// public class Sorting1 {
//     public static void bubbleSort(int arr[]) {
//         for (int turn = 0; turn < arr.length - 1; turn++) {
//             for (int j = 0; j < arr.length - 1 - turn; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         bubbleSort(arr);
//         printArray(arr);
//     }
// }

//optimize way
import java.util.*;
import java.util.Scanner;

public class Sorting1 {
    public static void BubbleSort(int arr[], int n) {
        // base condition
        if (n == 1)
            return;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        BubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr, arr.length);
        System.out.println("Sorted array is:");
        for (int var : arr) {
            System.out.print(var + " ");
        }
    }
}