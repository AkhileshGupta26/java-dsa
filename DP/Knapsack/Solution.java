class Solution {

    public static void main(String[] args) {
        int W = 50;
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};

        System.out.println(solve(wt.length, W, wt, val));
    }

    static int solve(int idx, int W, int[] wt, int[] val) {

        if (idx == 0 || W == 0) return 0;

        if (wt[idx - 1] <= W) {
            return Math.max(
                val[idx - 1] + solve(idx - 1, W - wt[idx - 1], wt, val),
                solve(idx - 1, W, wt, val)
            );
        }

        return solve(idx - 1, W, wt, val);
    }
     
}