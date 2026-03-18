package Question.MovingZeroTOLast;

public class MovingZero2 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        movingZeroes(nums);

        // Output the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void movingZeroes(int[] nums) {
        // Two-pointer approach
        int j = -1; // pointer to the first zero

        // Step 1: Find the index of the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, nothing to do
        if (j == -1) return;

        // Step 2: Traverse from j+1 to end and swap non-zero with j
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; // move j to next zero
            }
        }
    }
}
