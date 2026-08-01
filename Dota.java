// leetcode (649)  Dota@senate
import java.util.*;
class Solution {
    public String predictPartyVictory(String s) {
        int n= s.length();
        Queue<Integer> r= new ArrayDeque<>();
        Queue<Integer> d= new ArrayDeque<>();
        for(int i=0; i<n;i++){
            if(s.charAt(i)=='R') r.offer(i);
            else d.offer(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int r1= r.poll();
            int d1= d.poll();
          if(r1<d1){
            r.offer(r1+n);
          }
          else d.offer(d1+n);
        }
        return r.isEmpty() ? "Dire" : "Radiant";

    }
}