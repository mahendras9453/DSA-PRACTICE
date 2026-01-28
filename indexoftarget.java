// leetcode prblem(34) using linear search return the index of target element
class indexoftarget {
    public int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i; 
            }
        }
        
        return result;
   
            
        
    }
}