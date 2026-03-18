package DP.LCS;
import java.util.Arrays;
public class lcs_memo {
    public static void main(String[] args) {
        String s="abcde";
        String t="ace";
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1]; // take r+1 and c+1 size dp array
        for(int i=0;i<=dp.length-1;i++){
            Arrays.fill(dp[i], -1);
        }
        fun(s,t,m,n,dp);
        System.out.println(dp[m][n]);
        
    }
    static int fun(String s,String t,int m,int n,int[][] dp){
        // base case
        if(m==0||n==0){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        // choice option
        if(s.charAt(m-1)==t.charAt(n-1)){
         return dp[m][n]= 1+fun(s,t,m-1,n-1,dp);
        }
        else{
            int a=fun(s,t,m-1,n,dp);
            int b=fun(s,t,m,n-1,dp);
            return dp[m][n]= Math.max(a, b);
        }
    }
    
}
