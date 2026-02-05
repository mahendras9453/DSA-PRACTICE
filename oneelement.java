// leetcode (540) sigle elemnt in the sorted array
class oneelement {
    public int singleNonDuplicate(int[] nums) {
       int n=nums.length;
       for(int i=0;i<n-1;i=i+2){
        if(nums[i]!=nums[i+1]){
          return nums[i];
        }
       }
       return nums[n-1];
    }
}
