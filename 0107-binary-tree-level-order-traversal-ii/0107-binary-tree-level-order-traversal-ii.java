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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new LinkedList<>();
        if (root == null) {
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int level_length=q.size();
            List<Integer> ans=new ArrayList<>(level_length);
            while(level_length-->0)
            {
            TreeNode t= q.poll();
           
            ans.add(t.val);
            if(t.left!=null){
                q.offer(t.left);
            }
            if(t.right!=null){
                q.offer(t.right);
            }
            }
            res.add(0,ans);
        }
        return res;


    }
}