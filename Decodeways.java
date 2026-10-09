// leetcode 91 Decode ways
class Solution {
    
   public   int[] dp= new int[101];
    public int recursive(String s,int i){
       if(i==s.length()){
      
        return 1;
       
       }
       if(dp[i]!=-1) return dp[i];
       if(s.charAt(i)=='0') return 0;
       int ways =recursive(s,i+1);
      if(i+1 <s.length()){
       int check=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
       if(check<=26){
        ways +=recursive(s,i+2);
       }
      }
         dp[i]=ways;
         return ways;
      
        
    }

    public int numDecodings(String s) {
        Arrays.fill(dp,-1);
        
        return  recursive(s,0);
    }
}