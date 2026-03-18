package Question.UnionOfArray;
import java.util.LinkedHashSet;

public class Union {
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 = {4, 5, 6, 7, 8};

        LinkedHashSet<Integer> unionSet = new LinkedHashSet<>();
        // Add elements from the first array
        for (int num : nums1) {
            unionSet.add(num);
        }
        // Add elements from the second array
        for(int num : nums2) {
            unionSet.add(num);
        }
        // Print the union of the two arrays
        System.out.println("Union of the two arrays: " + unionSet);
    }
    
}
