//leetcode problem (268) return the missing number from array with range [0,n]
import java.util.*;
class missingnumbinrange {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
           
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
}