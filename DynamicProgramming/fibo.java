//FIbonacci no using dp

package DynamicProgramming;

public class fibo {
    public static int fib(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) { // fib(n) is already calculated
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // int dp[] = new int[n];
        System.out.println(fibTabulation(n));
    }
}
