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
    public int widthOfBinaryTree(TreeNode root) {
        // needs bfs, as each level has a different amount of nulls and all
        Queue<TreeNode> nodes=new LinkedList<>();
        Queue<Long> index=new LinkedList<>();

        nodes.offer(root);
        index.offer(0L);

        long maxWidth=0L;

        while(!nodes.isEmpty()){
            int size=nodes.size();
            long first=0,last=0;

            for(int i=0;i<size;i++){
                TreeNode node=nodes.poll();
                long ind=index.poll();

                if(i==0)first=ind;
                if(i==size-1)last=ind;

                if(node.left!=null){
                    nodes.offer(node.left);
                    index.offer(2*ind+1);
                }

                if(node.right!=null){
                    nodes.offer(node.right);
                    index.offer(2*ind+2);
                }
            }
            maxWidth=Math.max(maxWidth, last-first+1);
        }
        return (int) maxWidth;
    }
}