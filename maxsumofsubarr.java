//leetcode(2461)   maximum sum of distinct subarr with length K
import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         Map<Integer,Integer> map= new HashMap<>();
          long sum=0,Maxsum=0;
         for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
         }
        
        if(map.size()==k) Maxsum=sum;
         for (int i = k; i < nums.length; i++) {


            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];

       
            int old = nums[i - k];
            map.put(old, map.get(old) - 1);
            if (map.get(old) == 0) {
                map.remove(old);
            }
            sum -= old;

           
            if (map.size() == k) {
                Maxsum = Math.max(Maxsum, sum);
            }
        }

         
         return Maxsum;
    }
}
