// gfg Dijkhstra algorithm
class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
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
        int[] infy=new int[V];
        Arrays.fill(infy,Integer.MAX_VALUE);
        infy[src]=0;
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            int u=curr[0],d=curr[1];
            if(d>infy[u]) continue;
            for(int[] next :adj.get(u)){
                int v=next[0],w=next[1];
                if(infy[u]+w<infy[v]){
                    infy[v]=infy[u]+w;
                    pq.offer(new int[]{v,infy[v]});
                }
            }
        }
       ArrayList<Integer> res= new ArrayList<>();
        for(int d : infy){
            if(d==Integer.MAX_VALUE) res.add(-1);
            else {
                res.add(d);
            }
        }
        return res;
        
        
    }
}