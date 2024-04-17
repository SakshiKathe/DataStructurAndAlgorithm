package Arrays;

import java.util.*;

//Linear Search
// public class Arrays_practice {
//     public static int LinearSearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
//         int key = 10;

//         int index = LinearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Key is not found.");
//         } else {
//             System.out.println("Key is found at index: " + index);
//         }
//     }
// }

//Largest Number
// public class Arrays_practice {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest number: " + smallest);
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 3, 10, 4, 5, 6 };

//         System.out.println("Largest number is: " + getLargest(numbers));

//     }
// }

//Binary Search
// public class Arrays_practice {
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length - 1;
//         int mid = (start + end) / 2;

//         while (start <= end) {
//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
//         int key = 10;

//         System.out.println("Key found at: " + binarySearch(numbers, key));
//     }

// }

//Reversed an Array
// public class Arrays_practice {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length - 1;

//         while (first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 10, 2, 6, 7, 78 };

//         reverse(numbers);
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }

//SubArrays
// public class Arrays_practice {
//     public static void printSubArray(int numbers[]) {
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10 };
//         printSubArray(numbers);
//     }
// }

//Max SUbArray
public class Arrays_practice {
    public static void printmaxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MAximum Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printmaxSum(numbers);
    }
}