//striver ato z Book allocation problem
class Solution {
    public int findPages(int[] arr, int k) {
        if (k > arr.length) return -1; 
        // code here
        int sum=0;
        for(int num : arr){
             sum+=num;
        }
        int lo=1;
        int hi=sum;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isvalid(arr,k,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isvalid(int[] arr, int k,int mid){
        int student=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid) return false;
            if(arr[i]+pages<=mid){
                pages+=arr[i];
                
            }
            else{
                student++;
                pages=arr[i];
            }
        }
        return student<=k;
    }
}