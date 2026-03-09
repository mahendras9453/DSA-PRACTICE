//leetcode (976) return the perimeter of the possible traingle
import java.util.*;
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int peri=0;
        for(int i=n-1;i>=2;i--){
            if((nums[i-2]+nums[i-1]>nums[i])){
                peri=nums[i-2]+nums[i-1]+nums[i];
                break;
            }
        }
        return peri;
    }
}
