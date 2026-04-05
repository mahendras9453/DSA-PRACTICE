//leetcode(76)  minimum window Substring
import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
       
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char chars=t.charAt(i);
            map.put(chars,map.getOrDefault(chars,0)+1);

        }
        int matched=0;
        int windowstart=0;
        int windowend=0;
        int minlength=Integer.MAX_VALUE;
        int start=0;
     
    
        for(windowend=0;windowend<s.length();windowend++){
            char chars=s.charAt(windowend);
            if(map.containsKey(chars)){
                map.put(chars,map.get(chars)-1);
                if(map.get(chars)>=0) matched++;
            }

        
           while(matched==t.length()){
            if(minlength>(windowend-windowstart+1)){
                minlength=windowend-windowstart+1;
                start=windowstart;
            }
            char leftchar = s.charAt(windowstart);
             if(map.containsKey(leftchar)){
                if(map.get(leftchar)==0){
                    matched--;
                }
                map.put(leftchar,map.get(leftchar)+1);
             }
              windowstart++;

          

                } 
                
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(start, start + minlength);


    }
}