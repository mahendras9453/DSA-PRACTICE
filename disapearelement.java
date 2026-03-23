// leetcode (448) find all disappear element
import java .util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        HashSet<Integer> s = new HashSet<>();
        for( int num : nums){
            s.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                list.add(i);

            }
        }
       
        return list;
    }
}