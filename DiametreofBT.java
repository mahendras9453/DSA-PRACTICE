// leetcode 543 Diametre of the Binary Tree
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
    private int maxdiametre=0;
    public int diameterOfBinaryTree(TreeNode root) {
         getheight(root);
         return maxdiametre;
    }
    private int getheight(TreeNode root){
        if(root==null) return 0;
         int lef= getheight(root.left);
        int righ=  getheight(root.right);
        maxdiametre=Math.max(maxdiametre,lef+righ);
        return 1+Math.max(lef,righ);
    }
}
