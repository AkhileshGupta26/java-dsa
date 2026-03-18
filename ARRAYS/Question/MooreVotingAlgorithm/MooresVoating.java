 package Question.MooreVotingAlgorithm;

public class MooresVoating {

    // TC=O(n)
    // SC=O(1)
    public static void main(String[] args) {
        int [] nums = {2, 2, 3, 3, 1, 2, 2};
        int freq = 0;
        int ans = 0;

        // Moore’s Voting Algorithm
        for(int i=0; i<nums.length; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            } else {
                freq--;
            }
        }

        // print after loop
        System.out.println("The majority element is: " + ans);
    }   
}
