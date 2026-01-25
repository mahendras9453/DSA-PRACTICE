// leetcode problem (912) using Insertion sort
class insertionsort {
    public int[] sortArray(int[] nums) {
        int n= nums.length;
        for(int i=1;i<n;i++){
            int temp=nums[i];
            int j=i;
            while(j>0 && nums[j-1]>temp){
                nums[j]=nums[j-1];
                j--;
            }
            nums[j]=temp;

        }
        return nums;
    }
}