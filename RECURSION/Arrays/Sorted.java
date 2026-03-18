package RECURSION.Arrays;

public class Sorted {
    public static void main(String argu[]){
        int [] nums={1,2,3,4,5};
        System.out.println(sorted(nums,0));

    }
    static boolean sorted(int[] nums,int index){
        // Base condition
        if(index==nums.length-1){  //base case
            return true;
        }
        else{
            return nums[index]<nums[index+1] && sorted(nums,index+1);
            //  Checking for each element if it is less than next element
            //  && operator will return false if any of the element is not sorted
            
        }
    }
    
}
