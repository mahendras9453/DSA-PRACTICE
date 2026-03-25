// leetcode(643)  return the maximum avg of subarr
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        double avg=0;
       
        for(int i=0;i<k;i++){
         sum+=nums[i];
             }
    
       avg=(double)sum/k;
        double MaxAvg=avg;
   
  
    for( int i=k ; i<n;i++){
        sum+=nums[i]-nums[i-k];
        avg=(double)sum/k;
     
      MaxAvg=Math.max(MaxAvg,avg);
    }
    return MaxAvg;
    }

    
}
