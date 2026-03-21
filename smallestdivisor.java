// leetcode(1283)  return the smallest divisor given a threshold
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int lo=1;
        int hi=0;
        for(int num :nums){
            hi=Math.max(hi,num);
        }
        
        int result=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(possibledivisor(nums,mid,threshold)){
                result =mid;
                hi=mid-1;

            }
            else{
                lo=mid+1;
            }
        }
        return result;
    }
    static boolean possibledivisor(int [] nums,int mid,int threshold){
        int sum=0;
        for(int num : nums){
            sum+= (num +mid-1)/mid;
            
        }
        return sum<=threshold;
    }
}
