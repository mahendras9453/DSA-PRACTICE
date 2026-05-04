// leetcode(70)  Climbing Stairs
class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int pre1=1,pre2=2;
        for(int i=3;i<=n;i++){
            int curr=pre1+pre2;
            pre1=pre2;
            pre2=curr;
        }
        return pre2;
    }
}