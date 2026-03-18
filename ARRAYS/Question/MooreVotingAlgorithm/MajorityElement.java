 package Question.MooreVotingAlgorithm;

//  https://leetcode.com/problems/majority-element/description/

/*
 * The algorithm works by "canceling out" different elements.
 *  If two different elements are paired together, one majority
 *  element will survive at the end if it exists.
 */

//  TC=O(N), SC=O(1)

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 1, 2, 2};

        int majority = findMajorityElement(nums);

        System.out.println("The majority element is: " + majority);
    }

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify if candidate is truly majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // no majority element
        }
    }
}
