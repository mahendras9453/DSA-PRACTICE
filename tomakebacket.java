// leetcode(1482) return the minimum days to make the m bouquets
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       int n=bloomDay.length;
       int lo=0;
       int hi=1000000000;
       int result=-1;
       while(lo<=hi)  {
        int mid= lo+(hi-lo)/2;
        if(countminday(bloomDay,mid,k,m)){
            result=mid;
            hi=mid-1;

        }
        else{
            lo=mid+1;
        }
       }
       return result;
    }
   
    static boolean countminday(int [] bloomDay,int mid,int k,int m){
         int count=0;
    int consec_count=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count==k){
                    consec_count++;
                    count=0;
                }
            }
            else count=0;
            
        }
        return consec_count>=m;

    }
}