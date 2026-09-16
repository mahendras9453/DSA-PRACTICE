// leetcode  802 Find Eventual safe states
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] visited= new boolean[graph.length];
        boolean[] pathvisited= new boolean[graph.length];

       for(int i=0;i<graph.length;i++){
        if(!visited[i]){
            dfs(graph,i,visited,pathvisited);
        }

       }
       List<Integer> result= new ArrayList<>();
      for(int i=0;i<pathvisited.length;i++){
        if(pathvisited[i]==false) result.add(i);
      }
      return result;
    }
    public boolean dfs(int[][] graph,int i, boolean[] visited, boolean[] pathvisited){
        if(pathvisited[i]) return false;
        if(visited[i]) return true;
        visited[i]=true;
        pathvisited[i]=true;
        for(int next : graph[i]){
            if(!dfs(graph,next,visited,pathvisited)) return false;
        }
        pathvisited[i] =false;
        return true;

    }
}