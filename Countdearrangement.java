// gfg countdearrangement
class Solution {
   
    //  public long solve(int n){
    //      if(n==0) return 1;
    //      if(n==1) return 0;
    //   return ((n-1) * ((solve(n-1)+solve(n-2))));
    //  }
    public int derangeCount(int n) {
         int[] dp= new int[n+1];
        // code here
        dp[0]=1;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=(i-1)*((dp[i-1]+dp[i-2]));
        }
        return dp[n];
        //return (int) solve(n);
    }
}