package RECURSION.Introduction;
// int array[];

public class fibo {
    public static void main(String argu[]){
        int ans=fibo(100);
        System.out.println(ans);

    }
    static int fibo(int n){
        if(n==0 || n==1){ //base case
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2); //Recursive Relation
        }
    }
    
}
