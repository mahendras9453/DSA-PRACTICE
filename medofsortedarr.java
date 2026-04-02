// leetcode(4) median of two sorted arr
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0.0;
        int n= nums1.length;
        int m= nums2.length;
        int[] arr= new int[n+m];
        int i=0,j=0,k=0;
         while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;

            }
         }
            while(i<n){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            while(j<m){
                 arr[k]=nums2[j];
                j++;
                k++;
            }

         
         int middle=(arr.length)/2;
         if(arr.length%2==0){
            ans=(arr[middle-1] + arr[middle])/2.0;

         }
         else{
            ans=arr[middle];

         }
         return ans;
        
    }
}