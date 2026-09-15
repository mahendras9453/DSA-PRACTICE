// leetcode 210 Course schedule 
class Solution {
    public boolean iscycle;
    private void dfs(List<List<Integer>> adj,int i, boolean[] visited, boolean[] pathvisited,Stack<Integer> st){
        if(pathvisited[i]) {
            iscycle=true;
            return ;
        }
        if(visited[i]) return;
        visited[i]=true;
        pathvisited[i]=true;
        for(int next : adj.get(i)){
            dfs(adj,next,visited,pathvisited,st);
        }
        st.push(i);
        pathvisited[i]=false;
    }
    public int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            adj.get(pre[1]).add(pre[0]);
        }
        iscycle=false;
        Stack<Integer> st= new Stack<>();
        boolean[] visited= new boolean[n];
        boolean[] pathvisited= new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(adj,i,visited,pathvisited,st);
            }

        }
        if(iscycle==true) return new int[] {};
        int m=st.size();
        int[] arr= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=st.pop();
        }
        return arr;

    }
}