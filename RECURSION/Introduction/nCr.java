package RECURSION.Introduction;

public class nCr {
    public static void main(String[] args) {
    int ans=fun1(5,2);
    System.out.println(ans);
    }
    static int fun(int n){
        if(n==0 || n==1)return 1 ;
        else{
            return n*fun(n-1);
        }
        
    }
    static int fun1(int n,int r){
        if(r>n) return 0;
        int a=fun(n);
        int b=fun(n-r);
        int c=fun(r);
        return a/(b*c);
    }
    
}
