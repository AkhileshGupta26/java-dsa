package BinarySearch;

public class BinarySearch {
    // TC=O(logn) => Worst Case
    // TC=O(1)   => Best Case
    // SC=O(1)  
    // Array should be sorted for this case in Ascending order
    public static void main(String argu[]){
        int[] nums={2,4,6,8,10,12};
        int ans=binary_search(nums,8);
        System.out.println(ans);

    }
    static int binary_search(int[]nums,int target){
        // int type function return -1(not found) or value of index
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            //  mid is updated everytimes the loop runs 
            //  so it is inside while loop
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid; // returning index not value
            }
        }
        // Loop condition get's false
        // returning -1 outside the while loop
        return -1;// not found
    }
    
}
