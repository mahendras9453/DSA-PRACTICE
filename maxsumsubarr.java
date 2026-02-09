// leetcode problem(53) find the max sum of subarray
class maxsumsubarr {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max_sum=nums[0];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max_sum=Math.max(max_sum,sum);
            if(sum<0) sum=0;
          
        }
            
        
        return max_sum;

    }
}