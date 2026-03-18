package BinarySearch;

import java.util.ArrayList;

public class First_Last {
    public static void main(String[] args) {
        // Using ArrayList methods
        // TC=O(n) for both indexOf and lastIndexOf methods
        // SC=O(n) for the ArrayList
        
        int[] nums = {2, 3, 4, 4, 4, 4, 5, 6, 7};
        int target = 4;

        ArrayList<Integer> list=new ArrayList<>();

       for(int num : nums){
        list.add(num);
       }
       int first = list.indexOf(4); //TC=O(n)
       int last = list.lastIndexOf(4);//TC=O(n)
         
       System.out.println(first+" " + last);

    /*
     PROBLEM WITH THIS CODE:
    1.Not Good for large arrays
    2. Time Complexity is O(n) for both indexOf and lastIndexOf methods
    3. Space Complexity is O(n) for the ArrayList
    4. It uses extra space for the ArrayList, which is not necessary for this problem
     */
       
    }    
    
}
