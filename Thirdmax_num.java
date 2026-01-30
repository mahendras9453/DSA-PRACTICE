// leetcode problem(414) return the third max element of the array
class Thirdmax_num {
    public int thirdMax(int[] nums) {
      
         int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] == m1 || nums[i] == m2 || nums[i] == m3) continue;

            if (nums[i] > m1) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            } else if (nums[i] > m2) {
                m3 = m2;
                m2 = nums[i];
            } else if (nums[i] > m3) {
                m3 = nums[i];
            }
        }

        if(m3==Long.MIN_VALUE) return (int)m1;
        else return (int)m3;


        
    }
}