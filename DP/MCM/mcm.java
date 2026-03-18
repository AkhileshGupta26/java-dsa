package DP.MCM;

public class mcm {
    public static void main(String[] args) {
        // general approach to solve mcm and its variations
    }
    static int fun(int[] arr, int i, int j) {
        if (i >= j) return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {

            int a=costfun(arr, i, k, j)+fun(arr, i, k)+fun(arr, k+1, j);
            min=Math.min(min, a);
            // int steps = arr[i - 1] * arr[k] * arr[j] + fun(arr, i, k) + fun(arr, k + 1, j);
            // min = Math.min(min, steps);
        }

        return min;
    }
    static int costfun(int[] arr, int i, int k, int j) {
        return arr[i-1]*arr[k]*arr[j];
    }
    
}
