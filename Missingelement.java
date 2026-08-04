// leetcode (3731)  Find the missing element
import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        Arrays.sort(nums);
        int gr=nums[nums.length-1];
        int sm=nums[0];
        for(int num : nums){
            set.add(num);
        }
        for(int i=sm;i<=gr;i++){
            if(!set.contains(i)) list.add(i);
        }
       
        return list;
    }
}