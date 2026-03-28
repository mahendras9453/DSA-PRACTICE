// leetcode (1456)  maximum number of vowelsin a substring of given length
import java.util.*;
class Solution {
    public int maxVowels(String s, int k) {
       Set<Character> vowels=Set.of('a','e','i','o','u');
       int count=0;
       for(int i=0;i<k;i++){
        if(vowels.contains(s.charAt(i))){
            count++;
        }
        

       }
       int maxcount=count;
       for(int i=k;i<s.length();i++){
        if(vowels.contains(s.charAt(i))) count++;
        if(vowels.contains(s.charAt(i-k))) count--;
        maxcount=Math.max(maxcount,count);
       }
       return maxcount;
    }
}