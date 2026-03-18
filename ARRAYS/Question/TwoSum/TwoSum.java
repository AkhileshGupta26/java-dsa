 package Question.TwoSum;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - 1; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }

            // Put the current number and its index into the map
            map.put(nums[i], i);
        }

        System.out.println("No two sum solution found.");
    }
}
