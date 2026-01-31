//leetcode problem (238) productexceptself
class Product_ofArray_exceptself {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int left =1;
        int right=1;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]=right;
            right*=nums[i];
        }
        for(int j=0;j<n;j++){
            ans[j]=ans[j]*left;
            left=left*nums[j];
        }
        return ans;

    }
}
