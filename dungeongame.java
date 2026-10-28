// leetcode 174 Dungeon game
class Solution {
    public int m,n;
    public Integer[][] dp;
    // int result=Integer.MAX_VALUE;
    // public void backtrack(int[][] dg, int i, int j,int neg,int pos){
    //     if(i>=m || j>=n) return ;
    //     if(dg[i][j]<0){
    //          neg+=dg[i][j];
    //     }
    //     if(dg[i][j]>0){
    //          pos+=dg[i][j];
    //     }
    //       if(i==m-1 && j==n-1){
    //         result=Math.min(result,Math.abs(pos+neg));
    //         return ;
    //     }
      
    //     backtrack(dg,i+1,j,neg,pos);
    //      backtrack(dg,i,j+1,neg,pos);
         

    // }
//     public int calculateMinimumHP(int[][] dg) {
       
//         m=dg.length;
//         n=dg[0].length;
        
//          backtrack(dg,0,0,0,0);
//          return result+1;
//     }
// }
                         //==========memo
// public int solve(int[][] dg,int i , int j){
//     if(i>=m || j>=n) return Integer.MAX_VALUE;

//      if(i==m-1 && j==n-1){
//         return Math.max(1,1-dg[i][j]);
//      }
//      if(dp[i][j]!=null) return dp[i][j];

//    int right=solve(dg, i,j+1);
//      int down= solve(dg,i+1,j);
//      int need=  Math.min(right,down);
//     return dp[i][j]= Math.max(1,need-dg[i][j]);
// }
// public int calculateMinimumHP(int[][] dg) {
       
//         m=dg.length;
//         n=dg[0].length;
//         dp= new Integer[m][n];

//         return solve(dg,0,0);
//     }
// }
                   //========== tabulation=================
public int calculateMinimumHP(int[][] dg) {
       
        m=dg.length;
        n=dg[0].length;
        dp= new Integer[m][n];
       
       for(int i=m-1;i>=0;i--){
             for(int j=n-1;j>=0;j--){
               if(i==m-1 && j==n-1){
                  dp[i][j]= Math.max(1,1-dg[i][j]);
             }
             else if(i==m-1){
                dp[i][j]= Math.max(1,dp[i][j+1]-dg[i][j]);
             }
              else if(j==n-1){
                dp[i][j]= Math.max(1,dp[i+1][j]-dg[i][j]);
             }
             else{
                int right=dp[i][j+1];
                int down= dp[i+1][j];
                int need=  Math.min(right,down);
                dp[i][j]= Math.max(1,need-dg[i][j]);
             }
           }
       }
        return dp[0][0];
    }
}
