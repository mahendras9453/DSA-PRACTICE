// leetcode 909 snake and ladder 
class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        int[] arr= new int[n*n];
        int index=1;
        boolean left=true;
        for(int i=n-1;i>=0;i--){
            if(left){
                for(int j=0;j<n;j++){
                    arr[index++]=board[i][j];
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    arr[index++]=board[i][j];
                }
            }
            left=!left;
        }
        int step=0;
        boolean[] visited= new boolean[n*n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->=0){
                int curr=q.poll();
                if(curr==n*n) return step;
                for(int d=1;d<=6 && curr+d<n*n;d++){
                     int next= curr+d;
                     if(arr[next]!=-1) next=arr[next]-1;
                     if(!visited[next]){
                        visited[next]=true;
                        q.offer(next);
                     }

                }
                step++;
            }

        }
        return -1;
    }
}