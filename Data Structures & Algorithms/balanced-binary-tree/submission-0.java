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
        return Balanced(root)!= -1;
    }
    private int Balanced(TreeNode root){
        if(root==null)return 0;
        
        int l=Balanced(root.left);
        if(l==-1) return -1;

        int r=Balanced(root.right);
        if(r==-1) return -1;

        if(Math.abs(l-r)>1)return -1;
        return 1+Math.max(l,r);

    }
}
