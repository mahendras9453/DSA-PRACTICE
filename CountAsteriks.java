//leetcode(2315) Count Astericks
class Solution {
    public int countAsterisks(String s) {
        int count=0;
      Stack<Character> st= new Stack<>();
      for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='|'){
           if(!st.isEmpty() && st.peek()=='|'){
            st.pop();

           }
           else st.push('|');

         }
         else if(s.charAt(i)=='*'){
            if(st.isEmpty()) count++;
         }
      }
      return count;
    }
}
