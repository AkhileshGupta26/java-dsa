package RECURSION.Arrays;

public class BinarySearch {
    public static void main(String argu[]){
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target=5;
        int ans=binarysearch(nums,target,0,nums.length-1);
        System.out.println(ans);

    }
    static int binarysearch(int[] nums,int target,int start,int end){
        if(start>end){ //base condition
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){//base condition
            return mid;
        }
        if(nums[mid]>target){  // recursive relation
            return binarysearch(nums, target, start, mid-1);
        }
        return binarysearch(nums, target, mid+1, end);
        
    }
    
}
