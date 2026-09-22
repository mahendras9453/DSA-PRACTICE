// leetcode 1319 No. of operation to make network connected
class Solution {
    public int makeConnected(int n, int[][] connections) {
       if (connections.length < n - 1) return -1;
          DSU dsu= new DSU(n);
          int result=n;
        for(int[] e : connections){
        if(dsu.union(e[0],e[1])==true){
            result--;
            
        }
       

       }
        return  result-1;
    }
   static class DSU{
        int[] parent, rank;
        DSU(int n){
        parent= new int[n];
        rank= new int[n];
        for(int i=0; i< n;i++){
            parent[i]= i;
        }
        }
        int find(int x){
            if(parent[x]==x) return x;
            return parent[x]= find(parent[x]);
        }
         boolean union(int a, int b){
            int ra=find(a),rb=find(b);
            if(ra==rb) return false;
            else if(rank[ra]<rank[rb]) parent[ra]=rb;
            else if(rank[ra]> rank[rb]) parent[rb]=ra;
            else{
                parent[rb]=ra;
                rank[ra]++;

            }
            return true;
         
        }
    }
}