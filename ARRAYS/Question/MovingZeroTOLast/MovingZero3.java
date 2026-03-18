package Question.MovingZeroTOLast;
import java.util.*;

public class MovingZero3 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        movingZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void movingZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

}
