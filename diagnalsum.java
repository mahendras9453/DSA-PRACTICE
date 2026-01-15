// leetcode problem (1572) matrix diagnol sum
class diagnalsum {
    public int diagonalSum(int[][] mat) {
    int sum=0;
    int start=0;
    int end=mat.length-1;
    for(int i=0;i<mat.length;i++){
        if(start==end) sum-=mat[i][end];
        sum+=mat[i][start]+mat[i][end];
        start++;
        end--;
    }
    return sum;
    }
}
