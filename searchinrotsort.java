// leetcode(33) search in the roted sorted array
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
      
        int low=0;
        int high=n-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(nums[middle]==target){
                return middle;
            }
            else if(nums[low]<=nums[middle]){
                if(target>=nums[low] && target<nums[middle]){
                high=middle-1;
                }
                else low=middle+1;
            }
            else {
                if(target>nums[middle] && target <=nums[high]){
                    low=middle+1;
                }
                    else high=middle-1;
                
            }
        }
        return -1;
    
    }
}