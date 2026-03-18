package BinarySearch;

public class RotatedArray1 {
    // Rotated Sorted Array: Ascending -> Descending -> Ascending
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

            // CASE 3: Pivot is in the left part
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                // CASE 4: Pivot is in the right part
                start = mid + 1;
            }
        }

        // No pivot found
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
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

        // Target not found
        return -1;
    }
}
