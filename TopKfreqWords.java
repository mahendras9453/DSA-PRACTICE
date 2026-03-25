// leetcode (692)  return the Top K frequent words 
import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> s=new ArrayList<>();
        Map<String,Integer> map= new TreeMap<>();
        for(String num :words){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b) -> b.getValue().compareTo(a.getValue()));
        int count=0;
        for(Map.Entry<String,Integer> entry : list){
           s.add(entry.getKey());
            count++;
            if(count==k){
                break;
            }
        }

      return s;
    }
}
