//striver a to z  floor and ceil of number in array
class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
     
        int n= nums.length;
         int floor=-1;
         int ceil=-1;
       int left=0;
       int right=n-1;
  
       while(left<=right){
        int middle=left+(right-left)/2;
        if(nums[middle]==x){
            floor=nums[middle];
           ceil=nums[middle];
           break;
            
        }
        else if(nums[middle]<x){
             floor=nums[middle];

            left=middle+1;
            
        }
        else{
            ceil=nums[middle];
            right=middle-1;
            
        }
       }
       return new int[]{floor,ceil};
    }
}