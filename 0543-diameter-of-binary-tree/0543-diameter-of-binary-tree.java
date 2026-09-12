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
    int res=0;
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left_depth=helper(root.left);
        int right_depth=helper(root.right);
        res=Math.max(res,left_depth+right_depth);
        return 1+Math.max(left_depth,right_depth);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root);
       
        return res;
        
    }
}