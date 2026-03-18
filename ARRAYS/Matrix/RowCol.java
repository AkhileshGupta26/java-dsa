package Matrix;

import java.util.Arrays;

public class RowCol {
      public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }
    static int[] search(int[][]matrix,int target){
        int r=0;
        int c=matrix.length-1;
        
        // Row range = 0 to matrix.length-1
        // Col range = 0 to 

        while(r<matrix.length && c>= 0){     
            // CASE[1]
            // Found then return index in form of matrix as new int[]{r,c};
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            // CASE[2]

            if(target>matrix[r][c]){
                r++;
            }
            // CASE[3]
            else{
                c--;
            }
        }
        //Not exist
        return new int[]{-1,-1};

    } 
    
}
