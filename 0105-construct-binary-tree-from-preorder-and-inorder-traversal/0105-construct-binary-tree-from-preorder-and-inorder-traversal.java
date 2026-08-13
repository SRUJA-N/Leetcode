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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index=new int[1];
        index[0]=0;
        return helper(preorder,0,preorder.length-1,map,index);
    }
    public TreeNode helper(int[] preorder,int low,int high,HashMap<Integer,Integer> map,int[] index){
        if(low>high){
            return null;
        }
        int value=preorder[index[0]];
        index[0]=index[0]+1;
        TreeNode node=new TreeNode(value);
        int idx=map.get(value);
        node.left=helper(preorder,low,idx-1,map,index);
        node.right=helper(preorder,idx+1,high,map,index);
        return node;
    }
}