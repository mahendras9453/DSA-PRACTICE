//leetcode  994 rotting oranges 
class Solution {
    public int orangesRotting(int[][] grid) {
    
        int rows= grid.length;
        int cols= grid[0].length;
       int fresh=0;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                      q.offer(new int[]{i,j});

                    
                  
                }
                else if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        int min=-1;
        int[][] dir ={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int si=q.size();
            min++;
             for(int k=0;k<si;k++){
            int[] arr2d=q.poll();
          
           
            for(int[] d :dir ){
                int newi=arr2d[0]+d[0];
                int newj=arr2d[1]+d[1];
                if(newi>=0 && newi<rows && newj>=0 && newj<cols && grid[newi][newj]==1 ){
                    grid[newi][newj]=2;
                    fresh--;
                    q.offer(new int[]{newi,newj});
                     
                    
                }
            }
            }
        }
        if(fresh==0) return min;
        else return -1;
    }
}