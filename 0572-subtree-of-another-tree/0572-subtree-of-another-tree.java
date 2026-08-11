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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if( subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            boolean m=helper(root,subRoot);
            if(m==true){
                return true;
            }
        }
        boolean l= isSubtree(root.left,subRoot);
        if(l==true){
            return true;
        }
        boolean r=isSubtree(root.right,subRoot);
        if(r==true){
            return true;
        }
        return false;
        
    }
}