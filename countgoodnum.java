// leetcode (1922)  Count good number
class Solution {
    public int countGoodNumbers(long n) {
        long evenplace=(n+1)/2;
        long oddplace=n/2;
        long re= pow(5,evenplace)*pow(4,oddplace)%1000000007;
        return (int) re;
    }
    static long pow(long a,long b){
       if(b==0) return 1;
        long half=pow(a,b/2);
         half=(half*half)%1000000007;
        if(b%2==0) return half;
       else return (a%1000000007*half) %1000000007;
      
    }
}