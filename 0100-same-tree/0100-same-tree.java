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
    public boolean helper(TreeNode root1 ,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }else if(root1==null || root2==null){
            return false;
        }
        
        if(root1.val!=root2.val){
            return false;
        }
        boolean a1=helper(root1.left,root2.left);
        boolean a2=helper(root1.right,root2.right);

        return a1 && a2;


    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p,q);
    }
}