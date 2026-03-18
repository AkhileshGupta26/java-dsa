package Introduction;

import java.util.ArrayList;

public class arraylist {
    public static void main(String argu[]){
        // Declaration
        ArrayList<Integer> nums;
        // Initialization
        nums=new ArrayList<>(); 
        // Assigning values
        nums.add(1);
        nums.add(2);
        // Printing values
        System.out.println(nums);

        // Another way of declaration, initialization and assigning values
        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(5);
        nums2.add(10);
        nums2.add(15);
        nums2.add(20);
        System.out.println(nums2);

        /*
         How ArrayList print without using toString() method
         Because the ArrayList class @overrides the toString() method from the 
         Object class to give a human-readable output.
         In contrast, arrays (int[], String[], etc.) are objects but their class 
         (like [I for int[]) does not override toString().
          So it just inherits the default from Object
         */

        // Methods
        // add(index,value)
        nums2.add(1,7);
        System.out.println(nums2);

        // remove(index)
        nums2.remove(2);
        System.out.println(nums2);

        // remove(value)
        nums2.remove(Integer.valueOf(15));
        System.out.println(nums2);

        //  set(index,value)
        nums2.set(0,3);
        System.out.println(nums2);

        // get(index)
        System.out.println(nums2.get(0));
        System.out.println(nums2.get(1));

        // size()
        System.out.println(nums2.size());
        System.out.println(nums2);

        // contains(value)
        System.out.println(nums2.contains(10));
        System.out.println(nums2.contains(15));


        // 2D ArrayList
        ArrayList<ArrayList<Integer>> nums3=new ArrayList<>();

        // Input
        ArrayList<Integer> row1=new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        nums3.add(row1);

        ArrayList<Integer> row2=new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        nums3.add(row2);

        System.out.println(nums3);


        /*
        METHODS OF ARRAYLIST
        1.add(index,value) - Adds an element at the specified index
        2.add(value) - Adds an element at the end of the list

        3.remove(index) - Removes the element at the specified index
        4.remove(value) - Removes the first occurrence of the specified value

        5.set(index,value) - Replaces the element at the specified index with the specified value
        6.get(index) - Returns the element at the specified index

        7.size() - Returns the number of elements in the list
        8.contains(value) - Returns true if the list contains the specified value, otherwise false

        9.clear() - Removes all elements from the list
        10.isEmpty() - Returns true if the list is empty, otherwise false

        11.indexOf(value) - Returns the index of the first occurrence of the specified value, or -1 if not found
        
        12.lastIndexOf(value) - Returns the index of the last occurrence of the specified


        13.subList(int from, int to)	Gets a view of part of list

         */




    }
    
}
