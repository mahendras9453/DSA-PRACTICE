// leetcode 684 Reduntantconnection
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       int n= edges.length;
       DSU dsu= new DSU(n+1);
       for(int[] e : edges){
        if(!dsu.union(e[0],e[1])){
            return e;
        }

       }
       return new int[0];
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