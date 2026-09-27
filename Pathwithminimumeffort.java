// leetcode 1631 PAth with minimum effort 
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m= heights.length;
        int n= heights[0].length;
       int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        int[][]  dist= new int[m][n];
        for(int[] row : dist) Arrays.fill(row,Integer.MAX_VALUE);
        PriorityQueue<int[]> q= new PriorityQueue<>((a,b) -> a[0]-b[0]);
        q.offer(new int[]{0,0,0});
        dist[0][0]=0;
        int ans=0;
        while(!q.isEmpty()){
            int[] curr= q.poll();
            int node=curr[0],r=curr[1],c=curr[2];
          
            if(r==m-1 && c==n-1) return node;
          
            for(int[] d : dir){
                int nr=r+d[0];
                int nc=c+d[1];
                
                if(nr>=0 && nc>=0 && nr<m && nc<n ){
                     int effort=Math.max(node,Math.abs(heights[nr][nc]-heights[r][c]));
                    if(effort<dist[nr][nc]){
                        dist[nr][nc]=effort;
                    q.offer(new int[]{effort,nr,nc});
                    }
                }
            }

        }
        return 0;
        
    }
}