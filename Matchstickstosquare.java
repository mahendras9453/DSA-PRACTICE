// leetcode 473 Matchsticks to square
class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int i : matchsticks) sum+=i;
        if(sum%4!=0) return false;
     int target=sum/4;
     int[] arr= new int[4];
     Arrays.sort(matchsticks);
     return solve(matchsticks,matchsticks.length-1,arr,target);
    }
    public boolean solve(int[] ms,int idx,int[]  arr,int target ){
       if(idx<0){
        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]) return true;
       }
        for(int i=0;i<4;i++){
            if(  arr[i]+ ms[idx]<=target){
            arr[i]+=ms[idx];
            if(solve(ms,idx-1,arr,target)) return true;
            arr[i]-=ms[idx];
            }
        }


      return false;
        
    }
}