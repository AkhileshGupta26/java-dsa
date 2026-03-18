package Question.MovingZeroTOLast;

public class MovingZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        movingZeroes(nums);
        for (int z : nums) {
            System.out.print(z + " ");
        }
    }

    public static void movingZeroes(int[] nums) {
        int index = 0; // points to the next position to fill with a non-zero

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Step 2: Fill the rest of the array with zeroes
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
