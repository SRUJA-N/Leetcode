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
    public static void  helper(TreeNode root)
    {   
        if(root==null){
            return ;
        }
        TreeNode left_child=root.left;
        TreeNode right_child=root.right;

        root.right=left_child;
        root.left=right_child;

        helper(root.left);
        helper(root.right);
        
    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode res=root;
        helper(root);
        return res;
    }
}