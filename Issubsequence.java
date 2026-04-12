// leetcode(392)  Is subsequence 
class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int i=0;
         while(i < s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                
            }
         j++;
            
        }
        if(i==s.length()) {
            return true;
        }
        return false;
        
    }
}
