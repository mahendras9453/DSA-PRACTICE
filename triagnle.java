// leetcode 120 triangle
class Solution {
    public static Integer[][] dp;
     public static int solve(List<List<Integer>> triangle, int i, int j){
if(i==triangle.size()-1) return triangle.get(i).get(j);
       if(dp[i][j]!= null) return dp[i][j];
        int first=  +solve(triangle ,i+1 ,j);
        int second= solve(triangle , i+1, j+1);
        return dp[i][j]=triangle.get(i).get(j)+ Math.min(first,second);
     }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m= triangle.size();
       dp= new Integer[m][m];
      return solve(triangle, 0,0);
    }
}