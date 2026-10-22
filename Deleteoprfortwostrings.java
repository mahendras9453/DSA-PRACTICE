// leetcode 583 delete for twoo string
class Solution {
    public Integer[][] dp= new Integer[501][501];
    public int solve(String wd1, String wd2 , int i , int j){
        
    if(wd1.length()==i || wd2.length()==j  ) return Math.max(wd1.length()-i ,wd2.length()-j);
    if(dp[i][j]!=null) return dp[i][j];
    if(wd1.charAt(i)== wd2.charAt(j)) return solve(wd1,wd2,i+1,j+1);
    else{
        return dp[i][j]=1+Math.min(solve(wd1,wd2,i+1,j),solve(wd1,wd2,i,j+1));
    }
    }
    public int minDistance(String wd1, String wd2) {
        return solve(wd1,wd2, 0, 0);
    }
}