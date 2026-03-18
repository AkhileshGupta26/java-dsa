package BinarySearch;

import java.util.ArrayList;

public class First_Last1 {
    // TC=O(n)
     public static void main(String argu[]){
        int[] nums={2,3,4,4,4,4,5,6,7};
        
        int first=first(nums,4);
        int last=last(nums,4);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(first);
        ans.add(last);
        System.out.println(ans);

    }
    //  Linear Search
    static int first(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    // LS Opposite
    static int last(int[] nums,int target){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
