// leetcode 1091 shortest path in Binary matrix
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
       

        int level=1;
       
        int rows= grid.length;
        int cols= grid[0].length;
         if (grid[0][0] ==1 || grid[rows-1][cols-1] == 1) return -1;
        Queue<int[]> q= new LinkedList<>();
           q.offer(new int[]{0,0});
           grid[0][0]=1;
      
       int[][] dir = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

       while(!q.isEmpty()){
     int currsize= q.size();
     
   
     for(int k= 0;k<currsize;k++){
         int[] arr=q.poll();
         if(arr[0]==rows-1 && arr[1]==cols-1) return level;
            for(int[] d : dir){
                int nrow=arr[0]+d[0];
                int ncol=arr[1]+d[1];
                if(nrow>=0 && nrow<rows && ncol>=0 && ncol<cols && grid[nrow][ncol]==0){
                    grid[nrow][ncol]=1;
                    q.offer(new int[]{nrow,ncol});
                }
            }
     }
     level++;
       }

   return -1;
    }
}