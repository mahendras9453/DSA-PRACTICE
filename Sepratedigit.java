// leetcode (2553)  Separate Digits
class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb= new StringBuilder();
        for(int num : nums){
            sb.append(num);
        }
        int[] arr = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            arr[i]=sb.charAt(i)-48;
        }
        return arr;
    }
}
