package BinarySearch;

public class Infinite_array {
    //  Searching in array without knowing start and end
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 19, 100, 190, 140, 160}; // Example array
        int target = 10; // Target to find
        System.out.println("Index of target: " + findingRange(arr, target));
    }

    static int findingRange(int[] nums, int target) {
        // Initialize the range
        int start = 0;
        int end = 1;

        // Expand the range until the target is within the range
        // CASE 1
        while (target > nums[end]) {
            int newStart = end + 1;
            // Double the range size
            end = end + (end - start + 1) * 2;

            // Handle cases where the array ends before 'end'
            // CASE 2
            if (end >= nums.length) {
                end = nums.length - 1;
                break;
            }

            start = newStart;
        }

        // Perform binary search within the identified range
        // Returning to the binary search function
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        // Get start and end from the findingRange function
        // Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
    
}
