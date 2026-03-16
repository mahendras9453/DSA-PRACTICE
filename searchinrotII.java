//leetcode(81) saerch in roted arrayand return t or F
class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int middle = lo+(hi-lo)/2;
            if(nums[middle]==target) return true;
            if(nums[lo]==nums[middle] && nums[middle]==nums[hi]){
                lo++;
                hi--;
            }
           else if(nums[lo]<=nums[middle]){
            if(nums[lo]<=target && target<nums[middle]){
                hi=middle-1;

            }
            else lo=middle+1;
           }
           else{
            if(nums[middle]<target && target<=nums[hi]){
                lo=middle+1;
            }
            else hi=middle-1;
           }
        }
        return false;
    }
}