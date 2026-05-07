// leetcode (1051)  height checker
class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int p=0;
        int count=0;
        int[] arr= new int[n];
         for(int i : heights){
            arr[p++]=i;
         }
         Arrays.sort(heights);
         for(int i=0;i<n;i++){
           if(arr[i]!=heights[i]){
           count++;
           }
         }
         return count;
    }
}