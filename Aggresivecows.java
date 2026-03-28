//GFG Aggresive cows 
import java.util.*;
class Solution {
    public int aggressiveCows(int[] stalls, int k) {
         Arrays.sort(stalls);
        // code here
        int st=1;
        int end=max(stalls);
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(ispossible(stalls,mid,k)){
                ans=mid;
                st=mid+1;
                
            }
            else end=mid-1;
        }
        return ans;
    }
    static boolean ispossible(int [] stalls,int mid,int k){
       
        int cows=1;
        int laststallpos=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-laststallpos>=mid){
                laststallpos=stalls[i];
                cows++;
            }
            if(cows==k) return true;
        }
        return false;
    }
    
    static  int max(int [] stalls){
        int max=0;
        for(int i : stalls){
            max=Math.max(max,i);
        }
        return max;
        
    }
}
