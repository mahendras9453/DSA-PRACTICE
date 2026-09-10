// leetcode 733 Flood fill
class Solution {
    public void dfs(int[][] arr, int r,int c,int oldcol,int newcol){
        if(r<0 || c<0 || r>=arr.length || c>=arr[0].length) return;
        if(arr[r][c]!=oldcol) return;
        arr[r][c]=newcol;
        dfs(arr,r+1,c,oldcol,newcol);
        dfs(arr,r-1,c,oldcol,newcol);
        dfs(arr,r,c+1,oldcol,newcol);
        dfs(arr,r,c-1,oldcol,newcol);
     
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcol=image[sr][sc];
        if (oldcol == color) return image;
        dfs(image,sr,sc,oldcol,color);
        return image;
    }
}