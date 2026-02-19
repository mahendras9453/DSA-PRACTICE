//leetcode problem(628)  return the max product of three element in java
import java.util.*;
class maxproduct {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
         int product1=nums[n-1]*nums[n-2]*nums[n-3];
         int product2=nums[0]*nums[1]*nums[n-1];
         if(product1>product2) return product1;
         else return product2;
    }
}
