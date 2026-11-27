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
        // Use bfs with queue, go through each level and get the answer in a List<List<Interger>>
        List<List<Integer>> res = new ArrayList<>();

        // A queue to hold the data
        Queue<TreeNode> q = new LinkedList<>();

        // Base case of root = null
        if(root==null) return res;

        // Put the first value in queue
        q.offer(root);

        //Add childs row by row
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);

            }
            res.add(l);
        }
        return res;
    }
}