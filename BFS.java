// leetcode 102 Binary tree level order traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> list= new ArrayList<>();
      if(root==null) return list;
      Queue<TreeNode> qu=new LinkedList<>();
      qu.offer(root);
      while(!qu.isEmpty()){
        List<Integer> level=new ArrayList<>();
        for(int i=qu.size();i>0;i--){
            TreeNode node=qu.poll();
            level.add(node.val);
            if(node.left!=null) qu.offer(node.left);
              if(node.right!=null) qu.offer(node.right);
        }
        list.add(level);
      }
      return list;
    }
}
