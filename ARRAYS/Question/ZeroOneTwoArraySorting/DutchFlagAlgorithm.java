 package Question.ZeroOneTwoArraySorting;

import java.util.Arrays;

public class DutchFlagAlgorithm {

    // https://leetcode.com/problems/sort-colors

    /*

     ✅ Time Complexity → O(n)

     ✅ Space Complexity → O(1)

     */

    //  Another  way to solve problem by using Arrays.sort(nums) method
    // TC of Arrays.sort(nums) ->
    // O(n log n) and SC -> O(n) in worst case
    // Worst case-> O(N^2)
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0, 1, 2, 0, 1, 2};

        sortColors(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
