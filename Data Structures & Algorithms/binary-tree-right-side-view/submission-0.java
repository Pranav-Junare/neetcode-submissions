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
    public List<Integer> rightSideView(TreeNode root) {

        List<List<Integer>> check = new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null) return res;

        q.add(root);

        while(!q.isEmpty()){

            List<Integer> a=new ArrayList<>();

            for(int i=q.size();i>0;i--){

                TreeNode node=q.poll();

                if(node!=null){
                    a.add(node.val);
                    q.add(node.left); 
                    q.add(node.right); 
                }
            }

            if(a.size()>0) check.add(a);
        }

        for(int i=0;i<check.size();i++){

            List<Integer> currLvl = check.get(i);

            int lastEle = currLvl.size()-1;
            res.add(currLvl.get(lastEle));
        }
        return res;
    }
}
