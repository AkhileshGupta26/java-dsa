package Sorting;

public class SelectionSort {
    // TC
    // Best Case: O(n^2)
    // Worst Case: O(n^2)
    // Average Case: O(n^2)
    // SC=O(1)
    // Unstable Sort
    public static void main(String argu[]){
        int nums[]={3,1,5,4,2};
        selectionsort(nums);
        System.out.println(java.util.Arrays.toString(nums));

    }
    static void selectionsort(int[]nums){
        for(int i=0;i<=nums.length-2;i++){
            // Find the max element in remaining array and swap it with correct index
            int last=nums.length-1-i;
            //  creating variable last to reduce the number of times we are calculating the length of the array
            int maxIndex=getMaxIndex(nums,0,last);

            // swap
            swap(nums,maxIndex,last);
        }
    }
    
    private static int getMaxIndex(int[] nums, int start, int end) {
        int max=0;
        for(int i=start;i<=end;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
