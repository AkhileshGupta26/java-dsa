import java.util.Arrays;
public class lis1 {
    public static void main(String[] args) {
        
    }
//    memoization approach
    public int lengthOfLIS(int[] nums) {

        int prev = -1;
        int n = nums.length;

        int[][] dp = new int[n][n + 1];   // prev shifted by +1
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(nums, 0, prev, dp);
    }

    static int fun(int[] nums, int idx, int prev, int[][] dp) {

        if (idx == nums.length) return 0;

        if (dp[idx][prev + 1] != -1)
            return dp[idx][prev + 1];

        int a = 0, b = 0, c;

        // take
        if (prev == -1) {
            a = 1 + fun(nums, idx + 1, idx, dp);
        }
        
        // take in case prev is not -1
        if (prev != -1 && nums[idx] > nums[prev]) {
            b = 1 + fun(nums, idx + 1, idx, dp);
        }

        // skip
        c = fun(nums, idx + 1, prev, dp);

        dp[idx][prev + 1] = Math.max(a, Math.max(b, c));
        return dp[idx][prev + 1];
    }
}

