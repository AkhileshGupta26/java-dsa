package Sorting;

public class InsertionSort {
    public static void main(String argu[]){
        int[] nums = {5, 3, 4, 1, 2}; // Input array
        insertionSort(nums); // Sorting the array
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums));


    }
    public static void insertionSort(int[] nums) {
        // unsorted array
        for (int i = 1; i <= nums.length-1; i++) { // Start from the second element
            int key = nums[i]; // Element to be inserted
            int j = i - 1;
            //  j is the index of the last element in the sorted array

            // Move elements of nums[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                // nums[j] is the element to be shifted
                nums[j + 1] = nums[j]; // Shift the element
                j--;
            }

            // Insert the key into its correct position
            nums[j + 1] = key;
        }
    
}
}
