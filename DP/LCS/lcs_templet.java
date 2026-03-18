package DP.LCS;

public class lcs_templet {
    public static void main(String[] args) {
        String s="abcde";
        String t="ace";
        int m=s.length();
        int n=t.length();
        int result = fun(s,t,m,n);
        System.out.println(result);

        
    }
    static int fun(String s,String t,int m,int n){
        // base case
        if(m==0 || n==0){
            return 0;
        }
        // choice diagram
        if(s.charAt(m-1)==t.charAt(n-1)){
            return 1 + fun(s, t, m-1, n-1);
        } else {
            int a = fun(s, t, m-1, n);
            int b = fun(s, t, m, n-1);
            return Math.max(a, b);
        }
    }
    
}
