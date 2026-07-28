//leetcode 1249 Minimum remove to make the valid parenthesis
import java.util.*;
class Solution {
    public String minRemoveToMakeValid(String s) {
     HashSet<Integer> set= new HashSet<>();
     Stack<Integer> st= new Stack<>();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }
        if(s.charAt(i)==')' ){
            if(st.isEmpty()){
                set.add(i);
            }
            else st.pop();
        }
     }
     while(!st.isEmpty()){
        set.add(st.pop());
     }
     StringBuilder sb= new StringBuilder();
     for( int i=0; i<s.length();i++){
        if(!set.contains(i)){
            sb.append(s.charAt(i));

        }
        else continue;
     }
     return sb.toString();
    }
}
