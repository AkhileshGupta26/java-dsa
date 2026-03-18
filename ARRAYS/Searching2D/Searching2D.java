package Searching2D;

public class Searching2D {
    public static void main(String argu[]){
           // Searching in 2D array
           int [][] nums={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        // Searching in 2D array
        for(int i=0;i<=nums.length-1;i++){
            for(int j=0;j<=nums[i].length-1;j++){
                if(nums[i][j]==5){
                    System.out.println(i+"  "+j);
                }
                 
            }
        }
    }
    
}
