// leetcode(1004)  return the max consecutive ones III problem
class Solution {
    public int longestOnes(int[] nums, int k) {
         int n= nums.length;
          int left =0;
            int count =0;
            int Maxlength=0;
           for(int right=0;right<n;right++ ){
            if(nums[right]==0){
                count++;
            }
           while(count>k){
            if(nums[left]==0) {
            count--;
           
            }
             left++;
           }
           Maxlength=Math.max(Maxlength,right-left+1);

           }
           return Maxlength;
    }
}
