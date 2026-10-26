// atcode Bfrog 2 
import java.util.*;
public class Main{
  public static Integer[] dp;
   public static int  solve(int n, int[] arr,  int k , int j){
     if(j==n-1) return 0;
     if(j>= arr.length) return Integer.MAX_VALUE;
     if(dp[j]!=null) return dp[j];
    
     int ans=Integer.MAX_VALUE;
     for(int i=1;i<=k;i++){
      if((j+i)<=n){

        int valid=solve(n,arr,k,j+i);
        if(valid!=Integer.MAX_VALUE){
         int cost=Math.abs(arr[j]-arr[j+i])+valid;
         ans= Math.min(cost,ans);
        }
       
     }
     
     
     }
     return dp[j]= ans;
   }
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int k= sc.nextInt();
    int[] arr= new int[n];
    dp= new Integer[n];
    for(int i=0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(solve(n,arr,k,0));
  }
}