// leetcode problem(2529) count the positive and negative number
class Frequencycount {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                pos=pos;
                neg =neg;
            } 
            else if (nums[i]>0) pos++;
            else neg++;

        }
        if(pos>neg) return pos;
        else return neg;
          
    }
}
