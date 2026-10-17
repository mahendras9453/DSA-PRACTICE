// leetcode 931 minimum falling path sum 
class Solution {
    public int m,n;
    public  Integer[][] dp;
 
    
    public int solve(int[][] matrix, int row, int col){
         if (row < 0 || col < 0 || row >= m || col >= n) return Integer.MAX_VALUE;
           
           
        
            
              if (row == m - 1) return matrix[row][col];
              if(dp[row][col] !=null) return dp[row][col];
          int i= solve(matrix,row+1,col-1);
           int j=    solve(matrix,row+1,col);
           int k = solve(matrix,row+1,col+1);
         dp[row][col]= matrix[row][col]+ Math.min(i,Math.min(j,k));
         return dp[row][col];
            

           
         
    }

    public int minFallingPathSum(int[][] matrix) {
        int result= Integer.MAX_VALUE;
         m= matrix.length;
         n=matrix[0].length;
         dp= new Integer[m][n];
         for(int j=0;j<n;j++){
            result=Math.min(result,solve(matrix,0,j));
         }
         return result;
        
    }
}