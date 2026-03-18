package RECURSION.String;

public class Permutations {
    public static void main(String[] args) {
        Permutations("", "abc");
                
    }
    static void Permutations(String p, String up){

        if(up.isEmpty()){    // base case
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        //We need variable no. of calls to the recursive function
        for(int i=0;i<=p.length();i++){

            // The string p is split into left (from the start to index i) 
            // and right (from index i to the end).
            // The new string is formed as left + ch + right, where ch is inserted at the position i.
            
            String left= p.substring(0,i);
            String right= p.substring(i);
            Permutations(left+ch+right, up.substring(1));
        }
    }
}
