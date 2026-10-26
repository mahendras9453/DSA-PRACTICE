// leetcode 44 Wildcard matching 
class Solution {
    public static Boolean[][] dp;
    public boolean solve(String s, String p, int i, int j){
    if(i==s.length() && j== p.length()) return true;
    if(j==p.length()) return false;
    if(dp[i][j]!=null) return dp[i][j];
    if(i==s.length()){
        while(j<p.length()){
            if(p.charAt(j)!='*') return dp[i][j]=false;
            j++;
        }
        return dp[i][j]=true;
    }
    if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') return dp[i][j]=solve(s,p,i+1,j+1);
    if(p.charAt(j)=='*') return dp[i][j] =solve(s,p,i,j+1) || solve(s,p,i+1,j);
    return dp[i][j]=false;
    }
    public boolean isMatch(String s, String p) {
         int m= s.length();
         int n= p.length();
         dp=new Boolean[m+1][n+1];

        return solve(s,p,0,0);
    }
}