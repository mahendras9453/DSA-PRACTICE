// gfg BFS
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[] =new boolean[adj.size()];
        Queue<Integer> qu=new LinkedList<>();
        ArrayList<Integer> result= new ArrayList<>();
        visited[0] =true;
        qu.offer(0);
        while(!qu.isEmpty()){
            int node=qu.poll();
            result.add(node);
            for(int nighbour : adj.get(node)){
                if(!visited[nighbour]){
                   visited[nighbour]=true;
                   qu.offer(nighbour);
                }
            }
        }
        return result;
    }
}