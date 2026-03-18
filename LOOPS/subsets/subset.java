package LOOPS.subsets;

import java.util.List;

public class subset {
    public static void main(String argu[]){

    }
    static List<List<Integer>> subsets(int[] nums){
         List<List<Integer>> res=new ArrayList<>();
            List<Integer> subset=new ArrayList<>();
            helper(nums,0,subset,res);
            return res;
            
    }
    
}
