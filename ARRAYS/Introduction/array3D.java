package Introduction;
import java.util.Arrays;

public class array3D {
    public static void main(String argu[]){
        // Declaration
        int [][][] nums;
        String [][][] names;
        
        // Initialization
        nums=new int[2][3][4];
        names=new String[2][3][4];
        // Assigning values
        nums[0][0][0]=1;
        nums[0][0][1]=2;

        // Output
        System.out.println(Arrays.deepToString(nums));
        System.out.println(Arrays.deepToString(names));
        

    }
    
}
