// leetcode 947 Most stones removed in same row or column
class Solution {
    public void dfs(int[][] stones, int i ,boolean[] visited){
        visited[i]=true;
        int l=stones[i][0];
        int m= stones[i][1];
      for(int k=0;k<stones.length;k++){
        
        if((!visited[k]) &&( stones[k][0]==l || stones[k][1]==m)){
            dfs(stones,k,visited);
        }
      }
    }
    public int removeStones(int[][] stones) {
        int n= stones.length;
        int group=0;
        boolean[] visited= new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true) continue;
            dfs(stones,i,visited);
            group++;
        }
        return n-group;
    }
}