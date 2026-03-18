package Question.ZeroOneTwoArraySorting;

public class ZeroOneTwoArraySorting {

    /*
     Problem Statement: Given an array consisting of only 0s, 1s, and 2s. 
     Write a program to in-place sort the array without using inbuilt sort 
     functions. ( Expected: Single pass-O(N) and constant space)
     */
    public static void main(String[] args) {
        int [] nums={0, 1, 2, 0, 1, 2, 0, 1, 2};
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
        
    }
    
}
