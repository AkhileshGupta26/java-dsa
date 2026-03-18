 package Questions;

public class RotateArrayD {
    public static void main(String[] args) { 
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = nums.length;
        
        rotatedArray(nums, d, n);
        
        System.out.print("Rotated Array: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void rotatedArray(int[] nums, int d, int n) {
        d = d % n; // handle d > n
        
        // Step 1: Store first d elements in temp
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        // Step 2: Shift the rest of the array to the left
        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }

        // Step 3: Copy back the temp values at the end
        for (int i = 0; i < d; i++) {
            nums[n - d + i] = temp[i];
        }
    }
}
