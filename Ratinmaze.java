// gfg rat in the maze
class Solution {
    public void backtrack(int[][] maze,int i,int j,StringBuilder sb,  ArrayList<String> result){
          if(i==maze.length-1 && j==maze.length-1) {
            result.add(sb.toString());
            return ;
        }
       
        if(i>=0 && j>=0 && i<maze.length && j<maze.length && maze[i][j]==1){
           
        maze[i][j]=0;
          // Down
            sb.append('D');
            backtrack(maze,i+1,j,sb,result);
            sb.deleteCharAt(sb.length()-1);

            // Left
            sb.append('L');
            backtrack(maze,i,j-1,sb,result);
            sb.deleteCharAt(sb.length()-1);

            // Right
            sb.append('R');
            backtrack(maze,i,j+1,sb,result);
            sb.deleteCharAt(sb.length()-1);

            // Up
            sb.append('U');
            backtrack(maze,i-1,j,sb,result);
            sb.deleteCharAt(sb.length()-1);
             maze[i][j]=1;
            
        }
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
    ArrayList<String> result= new ArrayList<>();
    StringBuilder sb= new StringBuilder();
     backtrack(maze,0,0,sb,result);
     return result;
    
    }
}