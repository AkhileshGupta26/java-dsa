package Sorting;

import java.util.Arrays;

public class BubbleSort {
    // TC 
    // Best Case: O(n) when array is already sorted
    // Worst Case: O(n^2) when array is reverse sorted
    // Average Case: O(n^2)
    // SC=O(1)
    // Stable Sort
    public static void main(String argu[]){
        int [] nums={3,1,5,4,2};
        bubble(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void bubble(int[]nums){
        boolean swapped=false;
        //run the step n-1 times
        for(int i=0;i<=nums.length-2;i++){
            // 1 to n-1 == 0 to n-2
            // Second loop
            for(int j=0;j<=nums.length-2-i;j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){// or if(swapped==false)
                break;
            }
        }
    }
    
}
