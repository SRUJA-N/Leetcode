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
    public static void helper(TreeNode root,int sum,int target,List<List<Integer>> res,List<Integer> ans)
    {
        if(root==null){
            return ;
        }
        sum=sum+root.val;
        ans.add(root.val);
        if(root.left==null && root.right==null){
          

            if(sum==target){
                 res.add(new ArrayList<> (ans));
            }
          
        }else{
        
        helper(root.left,sum,target,res,ans);
         helper(root.right,sum,target,res,ans);
        }
        ans.remove(ans.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> ans=new ArrayList<>();
         List<List<Integer>> res= new ArrayList<>();
      helper(root,0,targetSum,res,ans);
      return res;
        
    }
}