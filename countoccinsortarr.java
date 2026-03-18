// striver a to z problem count occurence of target element in sorted arr
class Solution {
    public int countOccurrences(int[] arr, int target) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
     
        int first=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                first=mid;
                  hi=mid-1;
            }
            else if(arr[mid]>target){
                    hi=mid-1;
            }
            else lo=mid+1;
        }
        if(first==-1) return 0;
        lo=0;
        hi=n-1;
       int last=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                last=mid;
                  lo=mid+1;
            }
            else if(arr[mid]>target){
                    hi=mid-1;
            }
            else lo=mid+1;
        }
        
        
        return last-first+1;
    }
}