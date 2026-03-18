package BinarySearch;

public class First_Last_Occurrence {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 6, 6, 7, 8};
        int[] ans = binarySearch(nums, 6); // Returns an array of first and last index
        System.out.println("First Occurrence: " + ans[0]);
        System.out.println("Last Occurrence: " + ans[1]);
    }

    static int[] binarySearch(int[] nums, int target) {
        int[] ans = {-1, -1}; // Default to -1 if target not found
        int start = search(nums, target, true);  // Find the first occurrence
        int end = search(nums, target, false);  // Find the last occurrence
        ans[0] = start; // Store first occurrence index
        ans[1] = end;   // Store last occurrence index
        return ans;     // Return the result array
    }

    // This function returns the index of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1; // Default to -1 if not found
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Avoid potential overflow
            if (target < nums[mid]) {
                end = mid - 1;
            }
             else if (target > nums[mid]) {
                start = mid + 1;
            }
             else {
                // Target found, save the index
                ans = mid;
                // reducing more search space
                // CODE FOR START INDEX Reduction
                if (findStartIndex) {  // true means whole code reduces for finding start
                    end = mid - 1; // Narrow search to left side for first occurrence
                    // CODE FOR END INDEX REDUCTION
                } else {
                    start = mid + 1; // Narrow search to right side for last occurrence
                }
            }
        }
        return ans;
    }
}
