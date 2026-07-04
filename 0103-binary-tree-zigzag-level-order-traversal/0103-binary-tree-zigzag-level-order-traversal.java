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
  List<List<Integer>> result=new ArrayList<>();
  if(root==null){
   return result;
  }
  boolean change=true;
  q.offer(root);
  while(!q.isEmpty())
  {
      int n=q.size();
      LinkedList<Integer> current_element=new LinkedList<>();
        
      for(int i=0;i<n;i++)

      {
        TreeNode cur = q.poll();
         if(change)
         {
            current_element.addLast(cur.val);

         }else{
            current_element.addFirst(cur.val);
         }
         if(cur.left!=null)
         {
            q.offer(cur.left);
         }
         if(cur.right!=null)
         {
            q.offer(cur.right);
         }
      }
      result.add(current_element);
      change=!change;

  }
  return result;

        
    }
}