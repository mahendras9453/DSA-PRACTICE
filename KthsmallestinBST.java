// leetcode 230 Kth smallest in Binaru Search Tree
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
    public ArrayList<Integer> inOrder(TreeNode node,ArrayList<Integer> arr){
        if(node==null) return arr;
        inOrder(node.left,arr);
        arr.add(node.val);
        inOrder(node.right,arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
     ArrayList<Integer> newarr= inOrder(root,new ArrayList<Integer>());
     return newarr.get(k-1);

    }
}