// leetcode problem(55) jump game problem
class jumpgame {
    public boolean canJump(int[] nums) {
      int n = nums.length;
      int lastpos=n-1;
      for(int i =n-2;i>=0;i--){
        if(i+nums[i]>= lastpos) lastpos=i;
      } 
      return lastpos==0; 
    }
}
