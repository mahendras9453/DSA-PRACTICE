// gfg problem Ways to tile floor
class Solution {
    public static int[] dp;
    // public static int solve(int n){
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     if(dp[n]!=null) return dp[n];
    //     return dp[n]=solve(n-1)+solve(n-2);
        
        
    // }
    public int numberOfWays(int n) {
        // code here
        dp= new int[n+1];
        dp[0]=1;
        dp[1]=1;
       
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
    //    return solve(n);
    return dp[n];
    }
}