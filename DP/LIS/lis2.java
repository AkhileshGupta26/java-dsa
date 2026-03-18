import java.util.ArrayList;
//  BINARY SEARCH APPROACH
public class lis2 {
    public static void main(String[] args) {
        
    }
    class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arl = new ArrayList<>();
        fun(nums, arl);
        return arl.size();
    }
   //TC=NlonN

//   note:arl not store actual longest increasing subsequence 
// but it store the increasing subsequence of length arl.size() 
// with minimum last element

// v.v.imp: 2D Sorting + LIS Trick (Very Powerful)
    static void fun(int[] nums, ArrayList<Integer> arl) {
        for (int a : nums) {
            int left = 0;
            int right = arl.size();
            // binary search 
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arl.get(mid) < a) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            
            if (left == arl.size()) {
                arl.add(a);
            } else {
                arl.set(left, a);
            }
        }
    }
}
    
}
