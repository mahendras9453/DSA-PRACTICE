// GFG problem Row with max 1's
class Solution {
    public int rowWithMax1s(int arr[][]) {
       int ans=-1;
       int max=0;
       
       for(int i=0;i<arr.length;i++){
           int count=0;
           for(int j =0;j<arr[i].length;j++){
               if(arr[i][j]==1) count++;
                
           }
           if(count>max){
            ans=i;
             max=count;
           }
           
           
       }
       return ans;
        
    }
}