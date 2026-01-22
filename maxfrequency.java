// leetcode problem (1838) to get max frequency of element making it
import java.util.*;
class maxfrequency {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int left = 0, result = 1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

         
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;

    }
}