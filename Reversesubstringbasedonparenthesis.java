// leetcode 1190 Reverse substring based on the parenthsesis
class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(( s.charAt(i)=='(')){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(st.pop()==')'){
                    sb.append(st.pop());
                }
            }
            else st.push(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}