//striver a t z sheet Return the length of the longest sequence of consecutive integers.
//  The integers in this sequence can appear in any order.
import java.util.*;
class consecutivearr {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int longest=1;
        
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue ;
            }

            else if(nums[i]==nums[i-1]+1){
                count++;}
                else{
                    count=1;
                }
                longest=Math.max(longest,count);
            
        }
        return longest;
    }
}