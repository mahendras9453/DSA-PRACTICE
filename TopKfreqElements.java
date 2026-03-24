
//leetcode problem (347) return top K frequent elements
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new  HashMap<>();
        List<Integer> list=new ArrayList<>();
        for( int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num, 1);
            }
        }
        List<Map.Entry<Integer,Integer>> list1=new ArrayList<>(map.entrySet());
        Collections.sort(list1,(a,b)-> b.getValue().compareTo(a.getValue()));
        int count=0;
         for(Map.Entry<Integer,Integer> entry : list1){
            list.add(entry.getKey());
            count++;
            if(count==k){
                break;
            }
         }
         int [] arr=new int[k];
         
         for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);

            
         }

         return arr;

    }
}
