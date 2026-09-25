// leetcode 743 Network delay time 
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
         List<List<int[]>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
         for(int[] e : times){
           int u=e[0]-1,v=e[1]-1,w=e[2];
           adj.get(u).add(new int[]{v,w});
       
           
        }
        int[]  dist= new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.offer(new int[]{k-1,0});
        dist[k-1]=0;
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            int u=curr[0];
            int d=curr[1];
            for(int[] next : adj.get(u)){
                int v=next[0];
                int w=next[1];
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.offer(new int[]{v,dist[v]});
                }

            }
            

        }
        int ans=0;
        for(int value : dist){
            if(value==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,value);
        }
        return ans;
       
    }
}