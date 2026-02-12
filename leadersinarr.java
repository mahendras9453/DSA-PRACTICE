// Striver a to z sheer problem leaders in array
import java.util.*;
class leadersinarr {
    public List<Integer> leaders(int[] nums) {
       int n=nums.length;
       List<Integer> numbers=new ArrayList <>();
        int maxright=nums[n-1];
         numbers.add(maxright);
         for(int i=n-2;i>=0;i--){
            if(nums[i]>maxright){
                numbers.add(nums[i]);
                maxright=nums[i];
            }
         }
         Collections.reverse(numbers);
         return numbers;
    }
}
