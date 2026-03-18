 package Question.MooreVotingAlgorithm;

import java.util.HashMap;
import java.util.Map;

// TC=O(N)
// SC=O(N)

public class Batter {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 1, 2, 2};

        int n = nums.length;

        // Create a HashMap to store frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        // Storing in the Map
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        // After this loop 
        // map = {2=4, 3=2, 1=1}

        int majorityElement = -1;

        // Check for majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                majorityElement = entry.getKey();
                break;
            }
        }

        System.out.println("The majority element is: " + majorityElement);
    }
}
