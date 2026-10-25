// atcoder collection dice problem
import java.util.*;
 
public class Main {
  static final int MOD = 1000000007;
  static int[] dp;
public static int solve(int num){
  if(num==0) return 1;
  if(num<0) return 0;
  if(dp[num]!=-1) return dp[num];
return dp[num] = (int) (((long) solve(num-1) +
solve(num-2) +
solve(num-3) +
solve(num-4) +
solve(num-5) +
solve(num-6)) % MOD);
 
  
 
}
 
 
  
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
    
     int num=sc.nextInt();
dp= new int[num+1];
Arrays.fill(dp,-1);
    
     System.out.println(solve(num));
 
    }
