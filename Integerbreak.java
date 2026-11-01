// leetcode 343 Integer break
class Solution {
    public static Integer[] dp;
     public int solve(int n){
        if(n==1) return 1;

         int result=0;
         if(dp[n]!=null) return dp[n];
        for(int i=1;i<n;i++){
          
             int nb=i*(n-i);
             int b= i*solve(n-i);
             result=Math.max(result,Math.max(b,nb));
            
        }
        return dp[n]=result;
        

     }
    public int integerBreak(int n) {
        dp= new Integer[n+1];
        return solve(n);
    }
}