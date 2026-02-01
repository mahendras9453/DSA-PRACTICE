//leetcode problem(1752) to check the array is sorted and roted
class Rotedarray {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        
        return count <= 1;
    }
}