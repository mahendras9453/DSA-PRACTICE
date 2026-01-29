// leetcode problem (215) using Quicksort
class quick_sort {
    public int findKthLargest(int[] nums, int k) {
     
      Quicksort(nums,0,nums.length-1);


      return nums[nums.length-k];  
    }
    int partition(int[] arr,int low,int high){
        int pivot = arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        
        }
        return low;
    }
    void Quicksort(int[] nums,int low, int high){
        if (low < high) {
             int pi = partition(nums, low, high); 
             
             Quicksort(nums, low, pi - 1); 
             Quicksort(nums, pi, high); 
             }
    }
}
