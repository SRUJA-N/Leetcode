class Solution {
   
    public void helper(TreeNode root, TreeNode[] prev, TreeNode[] mis1, TreeNode[] mis2, TreeNode[] mis3, TreeNode[] mis4, int[] no_mis) {
        if (root == null) {
            return;
        }
        
        helper(root.left, prev, mis1, mis2, mis3, mis4, no_mis);
        
       
        if (prev[0] != null && prev[0].val > root.val) {
            if (no_mis[0] == 0) {
                mis1[0] = prev[0];
                mis2[0] = root;
                no_mis[0]++;
            } else {
                mis3[0] = prev[0];
                mis4[0] = root;
                no_mis[0]++;
            }
        }
        
       
        prev[0] = root;
        
        helper(root.right, prev, mis1, mis2, mis3, mis4, no_mis);
    }

    public void recoverTree(TreeNode root) {
        TreeNode[] mis1 = new TreeNode[1];
        TreeNode[] mis2 = new TreeNode[1];
        TreeNode[] mis3 = new TreeNode[1];
        TreeNode[] mis4 = new TreeNode[1];
        int[] no_mis = new int[1];
        TreeNode[] prev = new TreeNode[1];
        
      
        helper(root, prev, mis1, mis2, mis3, mis4, no_mis);
       
        if (no_mis[0] == 1) {
            int temp = mis1[0].val;
            mis1[0].val = mis2[0].val;
            mis2[0].val = temp;
        } else if (no_mis[0] == 2) {
            int temp = mis1[0].val;
            mis1[0].val = mis4[0].val;
            mis4[0].val = temp;
        }
    }
}