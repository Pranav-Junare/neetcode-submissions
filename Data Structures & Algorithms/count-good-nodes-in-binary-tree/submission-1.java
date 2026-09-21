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
        return dfs(root, root.val);
        
    }

    int dfs(TreeNode root, int v){
        if(root==null)return 0;

        int res=(root.val>=v) ? 1:0;
        v=Math.max(v, root.val);
        res+=dfs(root.left, v); 
        res+=dfs(root.right, v); 
        return res;
    }
}
