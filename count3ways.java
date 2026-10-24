// gfg Count 3 ways
class Solution {
    
    
     
        // if(n==0) return 1;
        //  if(n<0) return 0;
        //   if(dp[n]!=null) return dp[n];
        //  int a= solve(n-1);
        //  int b= solve(n-2);
        //   int c=solve(n-3);
        //   return  dp[n]=a+b+c;
       
           
        
       
     

    static int countWays(int n) {
        // add your code here
      int[] dp= new int[n+1];
       
       Arrays.fill(dp,-1);
           dp[0] = 1;
        dp[1]=1;
        dp[2]=3;
        for(int i=3;i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n+1];
    }
}
