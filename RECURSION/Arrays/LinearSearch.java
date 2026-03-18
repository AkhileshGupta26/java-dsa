package RECURSION.Arrays;

public class LinearSearch {
    public static void main(String argu[]){

    }
    static boolean linearSearch(int [] nums,int target,int index){
        if(index==nums.length){ //base condition
            return false;
        }
        if(nums[index]==target){ //base condition
            return true;
        }
        return linearSearch(nums, target, index+1); //recursive relation
    }
    
}
