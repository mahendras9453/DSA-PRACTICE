// leetcode(875) koko eating banana
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int n =piles.length;
       int lo=1;
       int hi=1000000000;
       while(lo<hi) {
        int mid=lo+(hi-lo)/2;
        if(caneatall(piles,h,mid)){
            hi=mid;
        }
        else{
            lo=mid+1;
        }
        


        
       }
       return lo;
    }
    static boolean caneatall(int[] piles,int h,int k){
        int hours=0;
        for(int pile :piles){
            hours+=(pile+k-1)/k;
           
        }
         return hours<=h;
    }
}