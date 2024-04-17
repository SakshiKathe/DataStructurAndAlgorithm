package DynamicProgramming;

import java.util.*;

public class climbingStairs {

    // climbing stairs using recursion
    // public static int countWays(int n) {

    // if (n == 0) {
    // return 1;
    // }
    // if (n < 0) {
    // return 0;
    // }
    // return countWays(n - 1) + countWays(n - 2);
    // }

    // memoization
    public static int countWays(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // already calculated
            return ways[n];
        }

        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];
    }

    // Tabulation
    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];// 0 to n
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        // int n = 5;
        // System.out.println(countWays(n));

        int n = 5;
        int ways[] = new int[n + 1]; // 0 0 0 0
        Arrays.fill(ways, -1); // -1 -1 -1 -1
        System.out.println(countWays(n, ways));
        System.out.println(countWaysTab(n));

    }
}