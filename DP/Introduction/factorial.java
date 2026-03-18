package DP.Introduction;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        fact(5,dp);
        Arrays.fill(dp,-1);
    }
    public static int fact(int n,int[]dp){
        if(n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=n*fact(n-1,dp);
        return dp[n];
    }
    
}
