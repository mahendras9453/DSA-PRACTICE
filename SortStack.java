// gfg Sort stack using recursion
import java.util.*;
class Solution {
    public void sortStack(Stack<Integer> st) {
      if(st.isEmpty()) return;
      int top=st.pop();
      sortStack(st);
      sortInser(st,top);
        
    }
     static void sortInser(Stack<Integer> st,int x){
         if(st.isEmpty() || st.peek()<=x){
             st.push(x);
             return;
         }
         int top=st.pop();
         sortInser(st,x);
         st.push(top);
         
     }
}
