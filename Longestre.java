// leetcode (424) Longest Repeating character Replacement
class Solution {
    public int characterReplacement(String s, int k) {
        int [] occurance= new int[26];
        int left =0,ans=0,maxocc=0;
        for(int right=0;right<s.length();right++){
            maxocc=Math.max(maxocc,++occurance[s.charAt(right)-'A']);
            if(right-left+1-maxocc>k){
            
                occurance[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}