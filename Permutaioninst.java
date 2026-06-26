// leetcode 567 Permutation in String;
import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map1= new HashMap<>();
        
        for(char s : s1.toCharArray()){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
            Map<Character,Integer> map2= new HashMap<>();
            int left=0;
            for(int right=0;right<s2.length();right++){
                char p=s2.charAt(right);
                map2.put(p,map2.getOrDefault(p,0)+1);
                if(right-left+1>s1.length()){
                    char leftchar=s2.charAt(left);
                    map2.put(leftchar,map2.getOrDefault(leftchar,0)-1);
                    if(map2.get(leftchar)==0){
                        map2.remove(leftchar);
                    }
                    left++;
                }
                if(right-left+1 ==s1.length()) {
                    if(map1.equals(map2)) return true;
                }

            }
              
          return false;
    }
}