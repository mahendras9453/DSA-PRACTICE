
// leetcode 300 Longest incrasing common subsequence
// class Solution {
// public static Integer[][] dp;
//     public int lengthOfLIS(int[] nums) {
//         dp= new Integer[nums.length+1][nums.length+1];
//         return solve(nums,0,-1);
//     }
//     public int solve(int[] arr, int i, int prev){
//         if(i==arr.length) return 0;
//         if(dp[i+1][prev+1]!=null) return dp[i+1][prev+1];
//         int nt= solve( arr, i+1,prev);
//         int take=0;
//         if(prev==-1 || arr[i]>arr[prev]){
//             take=1+solve(arr,i+1,i);
//         }
//         return  dp[i+1][prev+1]=Math.max(nt,take);
    
//     }
// }
//============tabulation
