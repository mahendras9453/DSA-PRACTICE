//leetcode (64) return max diff in two consecutive number
import java.util.*;
class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2 ) return 0;
        int diff=0;
        int g=0;

        Arrays.sort(nums);
        for(int i=n-1;i>=1;i--){
              g=nums[i]-nums[i-1];
            diff=Math.max(g,diff);

        }
        return diff;
        
    }
}