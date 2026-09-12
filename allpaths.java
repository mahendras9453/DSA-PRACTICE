// leetcode 797 all Paths from sorce to target
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path= new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        path.add(0);
        dfs(graph,0,path,result);
        return result;

    }
    public void dfs(int[][] graph,int node,List<Integer> path,List<List<Integer>> result){
        if(node==graph.length-1){
            result.add(new ArrayList<>(path));
            return ;
        }
        for(int next : graph[node]){
            path.add(next);
            dfs(graph,next,path,result);
            path.remove(path.size()-1);
        }

    }
}