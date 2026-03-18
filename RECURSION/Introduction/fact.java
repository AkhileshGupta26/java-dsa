package RECURSION.Introduction;

public class fact {
    public static void main(String argu[]){
        int ans=fact(5);
        System.out.println(ans);

    }
    static int fact(int n){
        if(n<=0){     // base case
            return 1;  
        }
        else{
            return n*fact(n-1);// recursive relation
        }
    }
}
