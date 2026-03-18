package RECURSION.Introduction;

public class digitsum {
    public static void main(String argu[]){
        int ans=digitsum(1234);
        System.out.println(ans);

    }
    static int digitsum(int n){
        if(n==0){// base case
            return 0;
            
        }
        else{
            return n%10+digitsum(n/10);// recursive relation
        }
    }
    
}
