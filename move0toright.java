//leetcode problem(283) MOve Zeroes to right
class move0toright {
    public void moveZeroes(int[] nums) {
      int n=nums.length;
      int[] arr=new int[n];
      int count =0;
      int pos=0;
      for(int i=0;i<n;i++){
        if(nums[i]==0){
            count++;

            
        }
        else arr[pos++]=nums[i];
       
      }

      int x=n-count;
      while(count!=0){
        arr[x]=0;
        x++;
        count--;
      }
      for(int k=0;k<n;k++){
        nums[k]=arr[k];
      }

    }
}