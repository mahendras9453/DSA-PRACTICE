// gfg Cycle in  Directed graph
class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj= new ArrayList<>(V);
       for (int i = 0; i < V; i++) {
                          adj.add(new ArrayList<>());
                      }
                      for (int[] edge : edges) {
                          adj.get(edge[0]).add(edge[1]);
                         
                      }
                      
                boolean[] visited= new boolean[V];
                boolean[] pathvisited= new boolean[V];
                for(int i=0;i<V;i++){
                    if(!visited[i] && dfs(adj,i,visited,pathvisited)) return true;
                }
                return false;
    }
    public boolean dfs(List<List<Integer>> adj,int i, boolean[] visited,boolean[] pathvisited){
        visited[i]=true;
        pathvisited[i]=true;
        for(int d : adj.get(i)){
            if(pathvisited[d]) return true;
            else if(visited[d]) continue;
            else{
                if(dfs(adj,d,visited,pathvisited))return true;
            }
        }
        pathvisited[i]=false;
        return false;
    }
}