// leetcode 52 nqueens
class Solution {
     public static boolean isvalid(List<List<String>> board,int row,int col){
      for(int i=0;i<row;i++){
            if(board.get(i).get(col).equals("Q")) return false;
        }
        for(int l=row,m=col; l>=0 && m<board.size(); l--,m++){
            if(board.get(l).get(m).equals("Q")) return false;
        }
        for(int j=row,k=col; j>=0 && k>=0; j--,k--){
            if(board.get(j).get(k).equals("Q")) return false;
        }
        return true;
        
    }
    public static void solve(List<List<String>> board,int row, List<List<String>> result){
      if(row==board.size()){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<board.size();i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<board.size();j++){
                    sb.append(board.get(i).get(j));
                }
                temp.add(sb.toString());
            }
            result.add(temp);
            return;
        }
        for(int col=0;col<board.size();col++){
            if(isvalid(board,row,col)){
              board.get(row).set(col,"Q");
                solve(board,row+1,result);
               board.get(row).set(col,".");
            }
        }
    }
    public int totalNQueens(int n) {
      List<List<String>> board= new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(".");
            }
            board.add(row);
        }
        List<List<String>> result= new ArrayList<>();
        
        solve(board,0,result);
        return result.size();
    }
}