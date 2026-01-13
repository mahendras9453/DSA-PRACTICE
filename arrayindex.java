// llectode problem (35) to return target index
class arrayindex {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
        }
    return n;
    }
}