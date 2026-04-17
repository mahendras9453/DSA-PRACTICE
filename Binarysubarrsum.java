// leetcode(930)  Binary subarr sum 
import java.util.*;
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int res=0;
       int curr=0;
       Map<Integer,Integer> map= new HashMap<>();
       map.put(0,1);
       for(int i : nums){
        curr+=i;
        res+=map.getOrDefault(curr-goal,0);
        map.put(curr,map.getOrDefault(curr,0)+1);
       }
        return res;
         
      
        
    }

}