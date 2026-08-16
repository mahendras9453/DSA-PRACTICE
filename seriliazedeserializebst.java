// leetcode 297 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String reserilize(TreeNode node,String st){
        if(node==null) {
            st+="null,";
        }
        else{
            st+=String.valueOf(node.val)+ ",";
            st=reserilize(node.left,st);
            st=reserilize(node.right,st);
        }
        return st;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return reserilize(root,"");
    }

    // Decodes your encoded data to tree.
    public TreeNode redeserialize(List<String> st){
       
        if(st.get(0).equals("null")){
            st.remove(0);
            return null;
        }
 
        TreeNode root=new TreeNode(Integer.valueOf(st.get(0)));
        st.remove(0);
        root.left=redeserialize(st);
        root.right=redeserialize(st);
        return root;
    }
    public TreeNode deserialize(String data) {
       String[] arr= data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(arr));
       return redeserialize(list);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));