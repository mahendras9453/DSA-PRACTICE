// leetcode 103 Binary tree Zigzag travesal 
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          List<List<Integer>> list= new ArrayList<>();
      if(root==null) return list;
      int le=0;
      Queue<TreeNode> qu=new LinkedList<>();
      qu.offer(root);
   
      while(!qu.isEmpty()){
        le++;
        List<Integer> level=new ArrayList<>();
        for(int i=qu.size();i>0;i--){
            TreeNode node=qu.poll();
            level.add(node.val);
            if(node.left!=null) qu.offer(node.left);
              if(node.right!=null) qu.offer(node.right);
        }
        if(le%2==0) Collections.reverse(level);
        list.add(level);
      }
      return list; 
    }
}