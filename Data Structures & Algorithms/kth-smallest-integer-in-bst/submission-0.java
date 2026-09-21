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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> a=new ArrayList<>();
        dfs(root,a);
        return a.get(k-1);

    }

    void dfs(TreeNode node, List<Integer> a){
        if(node==null)return;

        dfs(node.left, a);
        a.add(node.val);
        dfs(node.right, a);
    } 
}

