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
    int p=0;
    Map<Integer, Integer> m = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<preorder.length;i++) m.put(inorder[i],i);
        return dfs(preorder, 0, inorder.length-1);
    }

    TreeNode dfs(int[] preorder, int l, int r){
        if(l>r)return null;

        int root_val = preorder[p++];
        TreeNode node = new TreeNode(root_val);

        int mid  = m.get(root_val);

        node.left=dfs(preorder, l, mid-1);
        node.right=dfs(preorder,  mid+1,r);
        return node;
    }
}
