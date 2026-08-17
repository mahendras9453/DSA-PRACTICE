// leetcode 124 Binary tree max path sum
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxgain(TreeNode node){
        if(node==null) return 0;
        int leftgain=Math.max(maxgain(node.left),0);
        int rightgain=Math.max(maxgain(node.right),0);
        int pricenewpath=node.val+leftgain+rightgain;
        maxsum=Math.max(maxsum,pricenewpath);
        return node.val+Math.max(leftgain,rightgain);
    }
    public int maxPathSum(TreeNode root) {
        maxgain(root);
        return maxsum;
    }
}