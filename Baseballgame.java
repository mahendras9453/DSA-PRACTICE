// leetcode(682)  Baseball game
import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>  st= new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String number=operations[i];
            if(number.equals("+")){
                int val1=st.pop();
                  int val2=st.pop();
                  st.push(val2);
                   st.push(val1);
                  int newsum=val1+val2;
                  st.push(newsum);
            }
            else if(number.equals("C")) st.pop();
            else if(number.equals("D"))  st.push(2*st.peek());
            else{
                st.push(Integer.parseInt(number));
            }

            
    }
    while(st.size()>0){
        sum+=st.pop();
    }
        return sum;
    }
}