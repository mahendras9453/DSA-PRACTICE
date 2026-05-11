// leetcode (1768)  Merge String Alternatively
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder();
        int s1=word1.length()-1;
        int s2=word2.length()-1;
        int i=0,j=0;

        while(i<=s1 && j<=s2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
          
        }
          while(i<=s1){
             sb.append(word1.charAt(i++));
          
        }
        while(j<=s2){
             sb.append(word2.charAt(j++));
            
        }
       
        
        return sb.toString();
    }
}