package RECURSION.Introduction;

public class CountZeroes {
    public static void main(String argu[]){
        System.out.println(count(3030));
        // Special pattern

    }
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0){ // base case
            return c;
        }
        int rem=n%10;
        if(rem==0){  //evaluating each zero
            return helper(n/10,c+1); // if zero nextnumber and count increase 
        }
        return helper(n/10,c); // next number and count same
    }
}
