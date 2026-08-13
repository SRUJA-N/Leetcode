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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         HashMap<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index=new int[1];
        index[0]=inorder.length-1;
        return helper(postorder,0,postorder.length-1,map,index);
    }
    public TreeNode helper(int[] postorder,int low,int high,HashMap<Integer,Integer> map,int[] index){
        if(low>high){
            return null;
        }
        int value=postorder[index[0]];
        index[0]=index[0]-1;
        TreeNode node=new TreeNode(value);
        int idx=map.get(value);
         node.right=helper(postorder,idx+1,high,map,index);
        node.left=helper(postorder,low,idx-1,map,index);
       
        return node;
    }
}