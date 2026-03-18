package RECURSION.String;

public class Ascii {
    public static void main(String argu[]){
        subseqAscii("", "abc");


    }
    static void subseqAscii(String p,String up){
        // BASE CASE
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
         
        subseqAscii(p+ch,up.substring(1)); // include  TAKE IT
        subseqAscii(p,up.substring(1));   // exclude    IGNORE IT
        subseqAscii(p+(ch+0),up.substring(1));

    }

    // Method 2
    // ArrayList as return type

    


    
}
