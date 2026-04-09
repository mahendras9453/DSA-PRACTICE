// leetcode(977)  Squares of sorted arr
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] sortedarr=new int[n];
        for(int i=0; i<n;i++){
            sortedarr[i]=nums[i]*nums[i];

        }
        Arrays.sort(sortedarr);
        return sortedarr;
    }
}