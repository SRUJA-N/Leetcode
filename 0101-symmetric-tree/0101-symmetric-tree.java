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
    public static boolean helper(TreeNode root_left,TreeNode root_right)
    {   
        if(root_left==null &&  root_right==null){
            return true;
        }
        if(root_left==null|| root_right==null){
            return false;
        }
        
        if(root_left.val != root_right.val){
            return false;
        }
        return helper(root_left.left,root_right.right) && helper(root_left.right,root_right.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        return helper(root.left,root.right) ;
    }
}