package Introduction;
import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String argu[]){
        // Declartion
        int [][] nums;
        // Initialization
        nums=new int[2][3];
        // Assigning values
        nums[0][0]=1;
        nums[0][1]=2;
        nums[0][2]=3;
        //Output
        System.out.println(Arrays.deepToString(nums));
        // Another way of declaration, initialization and assigning values
        int[][] nums2={
            {1,2,3},
            {4,5,6}
        };
        System.out.println(Arrays.deepToString(nums2));
       
        // Taking input from user
        Scanner scn = new Scanner(System.in);
        for(int row=0;row<=nums.length-1;row++){
            for(int col=0;col<=nums[row].length-1;col++){
                nums[row][col]=scn.nextInt();
            }
        }
        // Iterating
        // Row=nums.length
        // Col=nums[0].length
        
        // Output Method 1
        for(int row=0;row<=nums.length-1;row++){
            for(int col=0;col<=nums[row].length-1;col++){
                System.out.print(nums[row][col]+" ");
            }
            System.out.println();
        }

        // Output Method 2
        for(int row=0;row<=nums.length-1;row++){
            System.out.println(Arrays.toString(nums[row]));
        }

        // Output Method 3
        // Enhanced for loop
        for(int[] row:nums){
            System.out.println(Arrays.toString(row));
        }

        // Output Method 4
        System.out.println(Arrays.deepToString(nums));
    }
    
}
