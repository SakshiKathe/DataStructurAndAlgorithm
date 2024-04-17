package Arrays;

import java.util.*;

public class MaxSub_arrays {
    public static void printmaxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sub: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printmaxSum(numbers);
    }
}
