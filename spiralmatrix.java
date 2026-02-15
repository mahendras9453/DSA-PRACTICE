// leetcode problem (54) print the spiral matrix
import java.util.*;
class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>();
        int row=0;
        int col=0;
        int count=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int max_element=matrix.length*matrix[0].length;
         while(count < max_element){

                for(int i=col;i<= maxcol && count<max_element;i++){
                    list.add(matrix[row][i]);
                    count++;

                }
               row++;
                for(int i=row;i<= maxrow  && count<max_element;i++){
                    list.add(matrix[i][maxcol]);
                    count++;

                }
                maxcol--;

                for(int i=maxcol;i>=col  && count<max_element;i--){
                    list.add(matrix[maxrow][i]);
                    count++;

                }
                maxrow--;
                for(int i=maxrow;i>=row  && count<max_element;i--){
                    list.add(matrix[i][col]);
                    count++;

                }
                col++;
                

                

            
        }
        return list;
    }
}
