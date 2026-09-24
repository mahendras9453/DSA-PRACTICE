// leetcode 3550 smallest index with digit sum
class Solution {
    public static int sum=0;
    public int smallestIndex(int[] nums) {
       for(int i=0;i<nums.length;i++) {
        if(i==sumofdigit(nums[i])) return i;
       }
       return -1;
    }
    public static int sumofdigit(int n){
        if(n==0) return 0;
        return sum+n%10+sumofdigit(n/10);
        
    }
}