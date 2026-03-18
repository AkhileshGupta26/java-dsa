package RECURSION.Arrays;
import java.util.ArrayList;

public class LinearSearch2 {
    //  Also return duplicate elements
    public static void main(String argu[]){
        int [] nums={1,2,3,4,5,6,4,7,8,9,10,5};
        int target=5;
        // boolean ans=linearSearch(nums,target,0);
        //   System.out.println(ans);
          findall(nums, target, 0);
          System.out.println(list);

    }
    static ArrayList<Integer> list=new ArrayList<>();// static arraylist
    static boolean linearSearch(int [] nums,int target,int index){
        if(index==nums.length){ //base condition
            return false;
        }
        if(nums[index]==target){ //base condition
            return list.add(index);
        }
        return linearSearch(nums, target, index+1); //recursive relation
    }
    static void findall(int [] nums,int target,int index){
        if(index==nums.length){ //base condition
            return;
        }
        if(nums[index]==target){ //base condition
            list.add(index);
        }
        findall(nums, target, index+1); //recursive relation
    }
    
    
}
