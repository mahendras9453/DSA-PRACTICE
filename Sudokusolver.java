// leetcode 37 Sudokusolver
class Solution {
   public boolean isvalid(char[][] board,int row,int col, char k){
    for(int i=0;i<9;i++ ){
        if(board[row][i]==k) return false;
        if(board[i][col]==k) return false;
    }
        int start_i=row/3*3;
        int start_j=col/3*3;
        for(int l=0;l<3;l++){
            for(int m=0;m<3;m++){
                if(board[start_i+l][start_j+m]== k) return false;
            }
        }
      

    
      return true;
   }
   
    public boolean solve(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                   for(char k='1';k<='9';k++){
                    if(isvalid(board,i,j,k)){
                        board[i][j]=k;
                        if(solve(board)==true)  return true;
                        board[i][j]='.';
                    }
                   
                   }
                    return false;
                }
            }
        }
        return true;
    }
     public void solveSudoku(char[][] board) {
        solve(board);
     }
}