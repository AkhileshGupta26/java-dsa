 package DP.Introduction;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];  // dp array initialized with 0
        System.out.println(fib(n, dp));
    }

    // TC: O(n)
    public static int fib(int n, int dp[]) {
        if (n == 0 || n == 1) {
            // Base case
            return n;
        }
        if (dp[n] != 0) {
            // Already computed
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}
