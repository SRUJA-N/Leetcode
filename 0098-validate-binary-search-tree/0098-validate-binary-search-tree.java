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
    public static void helper(TreeNode root,TreeNode[] prev,boolean[] res){
        if(root==null || !res[0]){
            return;
        }
       helper(root.left,prev,res);
        if(prev[0]==null){
            prev[0]=root;
        }else if(prev[0].val>=root.val){
                res[0]=false;
        }else{
            prev[0]=root;
        }
  helper(root.right,prev,res);
    }
    public boolean isValidBST(TreeNode root) {
        
        TreeNode[] prev=new TreeNode[1];
        prev[0]=null;
        boolean[] res=new boolean[1];
        res[0]=true;
   helper(root,prev,res);
   return res[0];
    }
}