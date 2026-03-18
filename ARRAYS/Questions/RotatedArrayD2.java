package Questions;

public class RotatedArrayD2 {
    // LOGIC
    // 1-> Reverse till d-1
    // 2-> Reverse from d to n-1
    // 3-> Reverse the whole array
    // Time Complexity: O(n)
// Space Complexity: O(1)

    

    public static void main(String[] args) {
        // Rotate an array by d to left
        int [] nums={1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        System.out.println("Original Array:");
        for (int i : nums) {
            System.out.print(i + " ");
        }   
        System.out.println();
        reverseLeft(nums, d);
        System.out.println("Array after rotation:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void reverseLeft(int[] nums, int d) {
        int n = nums.length;
        d = d % n; // handle d > n

        // Step 1: Reverse the first d elements
        reverse(nums, 0, d - 1);
        
        // Step 2: Reverse the remaining elements
        reverse(nums, d, n - 1);
        
        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);
    }
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
