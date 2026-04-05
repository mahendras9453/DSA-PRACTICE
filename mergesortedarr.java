//leetcode(88)  Merge sorted arr
import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
   
         int j=0;
       while(j<n){
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j++];
        }
       }
        Arrays.sort(nums1);
         
        for(int s=0;s<nums1.length;s++){
            System.out.print(nums1[s]);
        
        }

    }
}
