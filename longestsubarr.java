/*striver ato z sheet problem
Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k.
 If no such sub-array exists, return 0.
Input: nums = [10, 5, 2, 7, 1, 9],  k=15

Output: 4

*/
class longestsubarr {
    public int longestSubarray(int[] nums, int k) {
       int n = nums.length;
        int maxlen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
            sum+=nums[j];
            if(sum==k){
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        }
            
     return maxlen;
       
    }
}
