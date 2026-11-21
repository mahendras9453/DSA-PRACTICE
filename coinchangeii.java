// leetcode 518 coin change ii
// class Solution {
//     public static int n;
//     public static int  solve(int amount ,int[] coins, int i){
//       if(i>=n) return 0;
//       if(amount<0) return 0;
//       if(amount==0) return 1;
    
      
//         int take=solve(amount-coins[i],coins,i);
//         int skip= solve(amount,coins,i+1);
//         return take+skip;
//     }
//     public int change(int amount, int[] coins) {
//         n=coins.length;
//         return solve(amount,coins,0);
//     }
// }
// using recu and memo
class Solution {
    static Integer[][] dp;
    static int n;
     static int  solve(int amount ,int[] coins, int i){
      if(i>=n) return 0;
      if(amount<0) return 0;
      if(amount==0) return 1;
     if(dp[amount][i]!=null) return dp[amount][i];
      
        int take=solve(amount-coins[i],coins,i);
        int skip= solve(amount,coins,i+1);
        return dp[amount][i]=take+skip;
    }
    public int change(int amount, int[] coins) {
        n=coins.length;
        dp=new Integer[amount+1][n];
        return solve(amount,coins,0);
    }
}