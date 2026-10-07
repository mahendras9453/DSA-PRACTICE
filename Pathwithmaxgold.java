// leetcode 1219 Path with max gold 
class Solution {
    public int m,n;
    public int result=0;
    public void backtrack(int[][] grid,int i,int j,int sum){
        if(i<0 || j<0 || i>=m || j>=n|| grid[i][j]==0) return ;
       
       int  temp=grid[i][j];
        sum+=temp;
         result=Math.max(result,sum);
        grid[i][j]=0;
        int[][] dir= {{1,0},{-1,0},{0,1},{0,-1}};
      for(int[] d : dir){
        backtrack(grid,i+d[0],j+d[1],sum);
      }
    
      grid[i][j]= temp;

        
    }
    public int getMaximumGold(int[][] grid) {
        m= grid.length;
        n= grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    backtrack(grid,i,j,0);
                }
            }
        }
        
 return result;
    }
}