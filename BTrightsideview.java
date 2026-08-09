// Binary tree right side view  leetcode 199
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> qu= new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int len=qu.size();
            for(int i=0;i<len;i++){
                TreeNode node=qu.poll();
                if(i==len-1){
                    list.add(node.val);
                }
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null) qu.offer(node.right);
            }
        }
        return list;
    }
}