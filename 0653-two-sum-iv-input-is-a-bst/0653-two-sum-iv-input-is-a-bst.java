import java.util.Stack;

class Solution {
    // Class-level references, but they MUST be freshly instantiated in the main method
    private Stack<TreeNode> asc;
    private Stack<TreeNode> desc;

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        // Fix for global state contamination: Fresh stacks per test case
        asc = new Stack<>();
        desc = new Stack<>();

        // 1. Initialize the ascending stack (push root and all its left children)
        TreeNode t = root;
        while (t != null) {
            asc.push(t);
            t = t.left;
        }

        // 2. Initialize the descending stack (push root and all its right children)
        t = root;
        while (t != null) {
            desc.push(t);
            t = t.right;
        }

        // 3. Get the initial two pointers
        TreeNode i = getSmall();
        TreeNode j = getBig();

        // 4. Two-Pointer logic
        while (i != null && j != null && i != j && i.val < j.val) {
            int sum = i.val + j.val;
            
            if (sum == k) {
                return true;
            } 
            else if (sum > k) {
                j = getBig(); // Need a smaller value, move the right pointer down
            } 
            else {
                i = getSmall(); // Need a larger value, move the left pointer up
            }
        }

        return false;
    }

    // Equivalent to getSmall() in the video
    private TreeNode getSmall() {
        if (asc.isEmpty()) {
            return null;
        }
        
        TreeNode small = asc.pop();
        TreeNode rightChild = small.right;
        
        // Push the right child and its entire left lineage
        while (rightChild != null) {
            asc.push(rightChild);
            rightChild = rightChild.left;
        }
        
        return small;
    }

    // Equivalent to getBig() in the video
    private TreeNode getBig() {
        if (desc.isEmpty()) {
            return null;
        }
        
        TreeNode big = desc.pop();
        TreeNode leftChild = big.left;
        
        // Push the left child and its entire right lineage
        while (leftChild != null) {
            desc.push(leftChild);
            leftChild = leftChild.right;
        }
        
        return big;
    }
}