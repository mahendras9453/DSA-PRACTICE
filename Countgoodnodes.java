// leetcode 1448 Count good nodes in Binary Tree
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
    public int goodNodes(TreeNode root) {
       return countgoodnodes(root,Integer.MIN_VALUE);
    }
    private int countgoodnodes(TreeNode node , int maxval){
        if(node== null) return 0;
        int ans=0;
        if(node.val>=maxval){
            ans++;
            maxval=node.val;
        }
        ans+=countgoodnodes(node.left,maxval);
        ans+=countgoodnodes(node.right,maxval);
        return ans;
    } 
}
