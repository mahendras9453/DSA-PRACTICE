// leetcode 110 Balanced tree
import javax.swing.tree.TreeNode;

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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftheight= getheight(root.left);
        int rightheight=getheight(root.right);
        if(Math.abs(leftheight-rightheight)>1) return false;
        return isBalanced(root.left)  && isBalanced(root.right);
    }
    public int  getheight(TreeNode root){
        if(root==null) return 0;
         int leftheight= getheight(root.left);
        int rightheight=getheight(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
} {
    
}
