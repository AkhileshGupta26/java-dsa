package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class temp1 {
    public static void main(String[] args) {
        
    }
    void solve(int index, List<Integer> ds,int[]nums) {

    if (index == nums.length) {
        ans.add(new ArrayList<>(ds));
        return;
    }

    // take
    ds.add(nums[index]);
    solve(index + 1, ds);
    ds.remove(ds.size() - 1);

    // not take
    solve(index + 1, ds);
}

    
}
