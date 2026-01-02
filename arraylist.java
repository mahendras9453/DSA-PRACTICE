// leetcode problem number(442)return duplicate in the range [1,n]
import java.util.ArrayList;
import java.util.List;


class arraylist {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++){
        nums[Math.abs(nums[i])-1]*=-1;}
         for(int i=0; i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>0){
                res.add(Math.abs(nums[i]));
                 nums[Math.abs(nums[i])-1]*=-1;
            }
         }
    
        return res;
    }
}