public class Twosumes {
      
      
    public static int[] twoSum(int[] nums, int target) {
        
        int i;
        int j;
        int[] arr=new int[2];
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(
                nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                break ;
                }



            }
        

        }
     return arr;
    
    
}
      
      public static void main(String[] args) {
        int []nums ={2,3,4,7};
        int target;
        target= 9;
         int[] result = twoSum(nums,target);
System.out.println("indices" +result[0]+ "," + result[1]);
      }

    }