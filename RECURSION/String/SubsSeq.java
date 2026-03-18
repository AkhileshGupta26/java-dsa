package RECURSION.String;

import java.util.ArrayList;

public class SubsSeq {
    public static void main(String argu[]){
        subseq("", "abc");
        System.out.println(subseq2("", "abc"));

         

    }
    // Method 1
    // As Argument
    static void subseq(String p,String up){
        // BASE CASE
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
         
        subseq(p+ch,up.substring(1)); // include  TAKE IT
        subseq(p,up.substring(1));   // exclude    IGNORE IT

    }

    // Method 2
    // ArrayList as return type


    static ArrayList<String>  subseq2(String p,String up){

        
        // BASE CASE
        if(up.isEmpty()){
            // Creating a new ArrayList
            // Adding the processed string
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        // Creating two ArrayList
        // One for include and other for exclude
        // Returning the combined list
         
        ArrayList<String> left= subseq2(p+ch,up.substring(1)); // include  TAKE IT
        ArrayList<String> right=subseq2(p,up.substring(1));   // exclude    IGNORE IT
           
        left.addAll(right);
        return left;
    }
}
