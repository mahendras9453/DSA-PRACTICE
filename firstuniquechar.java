// leetcode(387)  return the first unique Character index of string
import java .util.*;
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char i : s.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
            for(Map.Entry<Character,Integer>  entry: map.entrySet()){
             
                if(entry.getValue()==1){
                    return s.indexOf(entry.getKey());
                    
                }
            }

        
        return -1;
    }
}