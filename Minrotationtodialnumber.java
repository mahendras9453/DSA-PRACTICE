// leetcode 4070  Minimum roation to dial number 1
class Solution {
    public int minRotations(String s) {
        int sum=0;
        int curr=0;
        for(char chr : s.toCharArray()){
            int target=chr-'0';
            int diff=Math.abs(curr-target);
            sum+=Math.min(diff,10-diff);
            curr=target;
        }
        return sum;
    }
}