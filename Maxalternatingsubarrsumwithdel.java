// leetcode 4072 maximum alternating sub arr sum with one deletion
class Solution {
    public long maxAlternatingSum(int[] nums) {
      int[] arr=nums;
        long a=Long.MIN_VALUE/2;
         long b=Long.MIN_VALUE/2;
         long c=Long.MIN_VALUE/2;
         long d=Long.MIN_VALUE/2;
         long ans=Long.MIN_VALUE;
        for(int x : arr){
            long olda=a;
             long oldb=b; 
             long oldc=c;
             long oldd=d;
            a=Math.max(x,oldb+x);
            b=olda-x;
            c=Math.max(oldd+x,olda);
            d=Math.max(oldc-x,oldb);
            ans=Math.max(ans,Math.max(a,Math.max(b,Math.max(c,d))));
            
        }
        return ans;
        
    }
}