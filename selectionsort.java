// selection sort code 
class selectionsort {
    public int[] sortArray(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++) {
            int min =i;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j]<nums[min]){
                    min=j;
                }
           }
             temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            
        }
        return nums;
    }
}