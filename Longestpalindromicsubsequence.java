// gfg longest palindromic subsequence
class Solution {
    public Integer[][] dp;
    public int solve(String s ,int i, int j){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return dp[i][j] = 2+solve(s,i+1,j-1);
        else return dp[i][j]=Math.max(solve(s,i+1,j),solve(s,i,j-1));
    }
    public int longestPalinSubseq(String s) {
        int m= s.length();
        // code here
        dp= new Integer[m][m];
        return solve(s,0,s.length()-1);
    }
}