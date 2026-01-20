// leetcode problem(217) basic hasing on array contains dublicate
import java.util.*;
class basichasing {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>() ;
        for(int i =0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return true;
        
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}