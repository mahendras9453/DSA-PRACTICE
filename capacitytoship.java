//leetcode (1011) capacity to  ship packages with in D days
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo=0;
        int hi=0;
        int res=0;
        int n = weights.length;
        for( int i : weights){
             lo= Math.max(lo,i);
             hi+=i;

        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mindays(weights, mid,days)){
                res=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return res;
    }
        static boolean mindays(int [] weights ,int mid , int days ){
                  int sum=0;
                  int count=1;
                  for( int i=0;i<weights.length;i++){
                
                    if(sum+weights[i]>mid) {
                        
                        count++;
                        sum=weights[i];
                    }
                    else{
                        sum+=weights[i];
                    }
                  }
                  return count<=days;

        }
        
    

}
