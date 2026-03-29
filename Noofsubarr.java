// leetcode (1343)  Number of subarrays of size k and average greater than or equal to threshhold
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold) count++;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            avg=sum/k;
            if(avg>=threshold) count++;
        }
        return count;
    }
}