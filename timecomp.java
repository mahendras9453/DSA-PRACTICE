// leetcode problem(704) binary search with time copmlexity O(logn)
class timecomp {
    public int search(int[] nums, int target) {
        int first,last,n,mid;
        n=nums.length;
        first=0;
        last=n-1;
        while(first<=last){
        mid=(first+last)/2;
        if(nums[mid]==target){
            return mid;

        }
        else if(nums[mid]<target){
            first=mid+1;
        }
        else{
            last=mid-1;
        }
        }
        return -1;

    }
}