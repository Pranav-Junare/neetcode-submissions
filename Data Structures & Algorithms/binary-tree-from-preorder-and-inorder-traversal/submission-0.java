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

    int preI=0;
    Map<Integer, Integer> ind=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<preorder.length;i++) ind.put(inorder[i],i);

        return dfs(preorder, 0, inorder.length-1);
    }

    TreeNode dfs(int[] preorder, int l, int r){
        if(l>r)return null;

        int rootV = preorder[preI++];
        TreeNode root=new TreeNode(rootV);

        int mid=ind.get(rootV);

        root.left = dfs(preorder,l,mid-1);
        root.right = dfs(preorder,mid+1,r);

        return root;
    }
}
