// leetcode 84 Largest Reactangle in Histogram
import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;

        int n= heights.length;
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<=n;i++){
            int currheight= (i==n) ? 0 :heights[i];
            while(!st.isEmpty() && currheight <heights[st.peek()]){
                int hi=heights[st.pop()];
                int width=st.isEmpty() ? i : i-st.peek()-1;
                maxarea= Math.max(maxarea,hi*width);
            }
            st.push(i);


        }
        return maxarea;

    }
}