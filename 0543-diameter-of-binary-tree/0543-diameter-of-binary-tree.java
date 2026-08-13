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
    public int helper(TreeNode root,int[] res){
        if(root==null){
            return 0;
        }
        int left=helper(root.left,res);
        int right=helper(root.right,res);
       
         res[0]=Math.max(res[0],left+right);
       return Math.max(left,right)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res=new int[1];
        int n=helper(root,res);
        return res[0];
    }
}