package RECURSION.Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String argu[]){
        int[] nums={5,4,3,2,9,1};
        bubble(nums,nums.length-1,0);
        System.out.println(Arrays.toString(nums));

    }
    static void bubble(int []nums, int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
             if(nums[col]>nums[col+1]){
                // Swap
                int temp=nums[col];
                nums[col]=nums[col+1];
                nums[col+1]=temp;

             }
            bubble(nums,row,col+1);
        }
        else{
            bubble(nums,row-1,0);
        }
    }
    
    
}
