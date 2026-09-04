// leetcode 542 01Matrix
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        boolean[][] visited=new boolean[rows][cols];
        int[][] result= new int[rows][cols];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int[][] dir ={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cell=q.poll();
            for(int[]  d : dir){
                int newi=cell[0]+d[0];
                int newj=cell[1]+d[1];
                if(newi>=0 && newi<rows && newj>=0 && newj<cols && !visited[newi][newj]){
                    result[newi][newj]=result[cell[0]][cell[1]]+1;
                    visited[newi][newj]=true;
                    q.offer(new int[]{newi,newj});
                }
            }
        }
        return result;

    }
    
}