// gfg minimum spanning tree
class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        List<List<int[]>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int[] e : edges){
           int u=e[0],v=e[1],w=e[2];
           adj.get(u).add(new int[]{v,w});
           adj.get(v).add(new int[]{u,w});
        }
        
        boolean[]  visited= new boolean[V];
        PriorityQueue<int[]> mh= new PriorityQueue<>((a,b) -> a[1]-b[1]);
        mh.offer(new int[]{ 0,0});
        int sum=0;
        while(!mh.isEmpty()){
            int[] cur= mh.poll();
            if(visited[cur[0]]==true) continue;
            visited[cur[0]]=true;
            sum+=cur[1];
            for(int[] next : adj.get(cur[0])){
                if(!visited[next[0]]){
                    mh.offer(new int[]{next[0],next[1]});
                }
            }
            
        }
        return sum;
    }
}
