// leetcode 417 Pacific  atlantic water flow
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m= heights.length,n=heights[0].length;
        List<List<Integer>> result= new ArrayList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                boolean[][]  visited= new boolean[m][n];
         boolean[] reach = new boolean[2]; 
                dfs( heights,i,j,visited,reach);
                if(reach[0] && reach[1]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }
    private void dfs(int[][] h,int i, int j,boolean[][] visited,boolean[] reach){
           int m= h.length,n=h[0].length;
           if(i<0 || j<0){
            reach[0]=true;
            return;

           }
           if(i>=m || j>=n){
            reach[1]=true;
            return;
           }
           if(visited[i][j]) return;
           visited[i][j]=true;
           int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
           for(int[] d : dirs){
            int x=i+d[0],y=j+d[1];
            if(x>=0 && y>=0 && x<m && y<n && h[x][y]<=h[i][j]){
                dfs(h,x,y,visited,reach);
            }
            else {
                if (x < 0 || y < 0) reach[0] = true;
                if (x >= m || y >= n) reach[1] = true;
            }
             
            
           }

    }
}