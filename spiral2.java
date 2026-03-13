//leetcode (59) spiral matrix 2
class Solution {
    public int[][] generateMatrix(int n) {
        int[][]  arr= new int[n][n];
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int s=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                 arr[top][i]=s;
                 s++;

            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=s;
                s++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=s;
                s++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=s;
                s++;

            }
            left++;

        }
        return arr;

        
    }
}
