 // Leetcode(49 ) Group Anagram 
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> s= new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for(String i : strs){
            char [] chars=i.toCharArray();
            Arrays.sort(chars);
           String s1 = new String(chars);
           if(map.containsKey(s1)){
             map.get(s1).add(i);
           }
           else{
            List<String> newlist = new ArrayList<>();
            newlist.add(i);
              map.put(s1,newlist);
           }

        }
        for(List<String> i : map.values()){
            s.add(i);
        }
        return s;
    }
}