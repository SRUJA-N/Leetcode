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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
     List<List<Integer>> res=new ArrayList<>();

     if(root==null){
        return res;
     }
     q.offer(root);
     boolean change=true;
     while(!q.isEmpty()){
        int l=q.size();
        Integer[] arr=new Integer[l];
        for(int i=0;i<l;i++){
            TreeNode temp=q.poll();
        int index;
        if(change){
            index=i;
        }else{
            index=l-1-i;
        }
        arr[index]=temp.val;
        if(temp.left!=null){
            q.offer(temp.left);
        }
        if(temp.right!=null){
            q.offer(temp.right);
        }
        }
        change=!change;
        res.add(Arrays.asList(arr));
     }
     return res;

        
    }
}