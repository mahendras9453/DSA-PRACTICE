// frog A at atcode
import java.util.*;
public class Main{
  public static Integer[] dp;
   public static int solve(int n , int[] arr, int i){
     if(i==n-1) return 0;
     if(dp[i]!=null) return dp[i];
     int take1=Math.abs(arr[i]-arr[i+1]) + solve(n,arr,i+1);
     int take2=Integer.MAX_VALUE;
     if(i+2<n){
     take2=Math.abs(arr[i]-arr[i+2]) + solve(n,arr,i+2);
     }
     return  dp[i]=Math.min(take1,take2);
    
     
   }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr= new int[n];
    for(int i=0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    dp= new Integer[n+1];
    System.out.println(solve(n,arr,0));
  }
  
}