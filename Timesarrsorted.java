//striver A t0 z problem to find the no of times arr sorted using O(n)
import java.util.*;
class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
      int n=nums.size();
      int count=0;
      int j=1;
     for(int i=1;i<n;i++){
       if (nums.get(i)<nums.get(count)) {
        count=i;
       }
       
        
     
    
     }
     return count;
    }
}