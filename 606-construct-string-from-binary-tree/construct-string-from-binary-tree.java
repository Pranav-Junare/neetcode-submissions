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
    StringBuilder sb;
    public String tree2str(TreeNode root) {
        sb=new StringBuilder();
        dfs(root);
        return sb.toString();
    }
    void dfs(TreeNode root){
        if(root==null)return;

        sb.append(root.val);
        if(root.left==null && root.right==null)return;
        
        sb.append("(");
        if(root.left!=null) dfs(root.left);
        sb.append(")");

        if(root.right!=null){
            sb.append("(");
            dfs(root.right);
            sb.append(")");
        }
    }
}