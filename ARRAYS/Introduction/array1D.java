package Introduction;
import java.util.Arrays;
import java.util.Scanner;
// In Java, the JVM abstracts 
// physical continuity but ensures logical indexing works seamlessly.
// The JVM ensures that the array behaves as if it were stored in a contiguous block.
// for accessing element i = Base Address+(Index×Size of each element)
// This allows direct access even if the memory isn’t physically contiguous.

/*
 * | Array Type                          | Contiguous Memory in Java?                    |
| ----------------------------------- | --------------------------------------------- |
| `int[]`, `char[]`, `double[]`, etc. | ✅ Yes                                         |
| `String[]`, `MyClass[]`, etc.       | ✅ Yes for references only, not actual objects |

 */

/*All Java variables must be identified with unique names.
  These unique names are called identifiers. */

public class array1D {
    public static void main(String argu[]){
        // Declartion
        // Memeory Not allocated
        // Referance variable created ,pointing nowhere
        int [] nums;
        // Initialization
        // Memory allocated 
        // nums pointing to 0
        nums=new int[5];
        // Assigning values
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        // Printing values
        System.out.println(Arrays.toString(nums));

        // Printing values
        for(int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }

        // Another way of declaration, initialization and assigning values
        int[] nums2={1,2,3,4,5};
        System.out.println(nums2);
        System.out.println(Arrays.toString(nums2));

        // Another way of declaration, initialization and assigning values
        int[] nums3=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(nums3));

        // output
        System.out.println(nums);
        // it prints the array's reference (memory address) in the form of a string

        // It returns String not the integer values of the array.
        /*
         * Because you're printing the array object directly, and Java internally
         *  calls the default toString() from Object, which looks like:
         * 
         * return getClass().getName() + "@" + Integer.toHexString(hashCode());
         * 
            | Part       | Meaning                                                                             |
| ---------- | ----------------------------------------------------------------------------------- |
| `[`        | This means it's an **array**                                                        |
| `I`        | This means it's an array of **int**                                                 |
| `@`        | Separates the type from the hashcode                                                |
| `3feba861` | This is the **hexadecimal hashcode** (memory address-like) from `Object.toString()` |


         */

        //String array
        String[] names={"John","Doe","Jane"};
        System.out.println(Arrays.deepToString(names));

        // By default, the values of an array are initialized to zero
        int [] nums4=new int[5];
        System.out.println(Arrays.toString(nums4));
        // By default, the values of a string array are initialized to null
        String [] nums5=new String[5];
        System.out.println(Arrays.toString(nums5));
        // Boolean array
        // By default, the values of a boolean array are initialized to false
        // Boolean array
        Boolean [] nums6=new Boolean[5];
        System.out.println(nums6[0]);
        System.out.println(Arrays.toString(nums6));
        // Char array
        // By default, the values of a char array are initialized to '\u0000'
        char [] nums7=new char[5];
        System.out.println(Arrays.toString(nums7));
         
        // Taking input from user
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            nums[i]=scn.nextInt();
        }
        
         
    }
    
}
