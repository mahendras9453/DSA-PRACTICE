// leetcode(74)  search in 2D matrix 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
       int st=0;
       int end=(m*n)-1;
       while(st<=end){
        int mid=st+(end-st)/2;
        if(matrix[mid/n][mid%n]>target){
            end=mid-1;

        }
        else if(matrix[mid/n][mid%n]<target){
            st=mid+1;
        }
        else return true;
       }
       return false;
    }
}