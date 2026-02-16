// leetcode(153) return min in the roted sorted array
class mininrotarr {
    public int findMin(int[] nums) {
        int n =nums.length;
        int h=n-1;
        int L=0;
        while(L<h){
            int mid=(L+h)/2;
            if(nums[mid]>nums[h]){
                L=mid+1;
            }
            else{
                h=mid;
            }
        
        }
        return nums[L];
    }
}
