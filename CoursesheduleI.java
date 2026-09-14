// leetcode 207 Course shedule I
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }
        boolean[] visited= new boolean[numCourses];
         boolean[] pathvisited= new boolean[numCourses];
         for(int i=0;i<numCourses;i++){
            if(!dfs(graph,i,visited,pathvisited))return false;
         }
         return true;
    }
    public boolean dfs(List<List<Integer>> graph,int i,boolean[] visited ,boolean[] pathvisited){
        if(pathvisited[i]) return false;
        if(visited[i]) return true;
        visited[i]=true;
        pathvisited[i]=true;
        for(int next : graph.get(i)){
            if(!dfs(graph,next,visited,pathvisited)) return false;
        }
        pathvisited[i] =false;
        return true;
    }
}