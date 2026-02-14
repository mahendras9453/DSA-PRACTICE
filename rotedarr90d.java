
//leetcode problem(48) to roted array by 90 degree
class rotedarr90d {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int [][] roted=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
             
            }
        }
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        
        }

       
    }
}