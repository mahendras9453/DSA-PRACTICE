// leetcode problem(2149) Rearrange array with sign
class Rearrangearrbysign {
    public int[] rearrangeArray(int[] nums) {
        int n =nums.length;
        int[] pos =new int[n/2];
        int[] neg =new int[n/2];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos[k++]=nums[i];
        }
        int l=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0) neg[l++]=nums[i];
        }
        int p=0;  int y=0;
        int d=n/2;
        while(d!=0){
            nums[p]=pos[y];
            nums[p+1]=neg[y];
            p=p+2;
            y++;
            d--;
            
            
        }
        return nums;

    }
}