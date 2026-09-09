// leetcode 841 Keys and rooms
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q= new LinkedList<>();
        visited[0]=true;
        q.offer(0);
        while(!q.isEmpty()){
            int roomkey= q.poll();
            for(int key :rooms.get(roomkey)){
                if(!visited[key]){
                    visited[key]=true;
                    q.offer(key);
                }
            }
        }
        for(boolean s : visited){
            if(!s) return false;
        }
        return true;

    }
}