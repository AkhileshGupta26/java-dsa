package BinarySearch;
// Duplicates elements case

public class RotatedArray2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println(search(nums, target)); // Correctly calling the search method
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // Pivot not found -> Array is not rotated
        if (pivot == -1) {
            // Perform normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, we have two ascending sorted arrays
        // CASE 1: If target is the pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // CASE 2: If target lies in the left sorted portion
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // CASE 3: If target lies in the right sorted portion
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // CASE 1: Mid is greater than next element
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // CASE 2: Mid is smaller than the previous element
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // CASE 3: If elements at start, mid, and end are equal, skip duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // Check if start is pivot
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                // Check if end is pivot
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // CASE 4: Left side is sorted, so pivot should be on the right side
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }
            // CASE 5: Right side is sorted, so pivot should be on the left side
            else {
                end = mid - 1;
            }
        }

        // No pivot found
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }
}