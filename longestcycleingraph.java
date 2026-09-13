// leetcode 2360 longestcycleingraph
class Solution {
    int result=-1;
    public int longestCycle(int[] edges) {
        int n= edges.length;
        boolean[] visited= new boolean[n];
        boolean[] visitedpath= new boolean[n];
        int[] count =new int[n];
        for(int i=0;i<n;i++){
            count[i]=1;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]) {
                dfs(edges,i,visited,visitedpath,count);
                
            }
        }
        return result;

    }
    public void dfs(int[] edges,int i,boolean[] visited,boolean[] visitedpath,int[] count){
        if(i!=-1){
            visited[i]=true;
            visitedpath[i]=true;
            int v=edges[i];
            if(v!=-1 &&!visited[v]){
                count[v]=count[i]+1;
                dfs(edges,v,visited,visitedpath,count);
            } else if(v!=-1 && visitedpath[v]==true){
                result=Math.max(result,count[i]-count[v]+1);
            }
            visitedpath[i]=false;
           
        }
    }

}