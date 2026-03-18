package BinarySearch;

public class CeilingFloor {
    // Loop true: S M E
    // Loop false: E M S
    public static void main(String argu[]){
        int[]nums={2,4,6,8,10,12};
        int ans=binarysearch(nums,9);
        System.out.println(ans);

    }
    static int binarysearch(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
                // retrun index not value
            }
        }
        return nums[start];
        // For floor 
        //  Return end

    }
    
}
