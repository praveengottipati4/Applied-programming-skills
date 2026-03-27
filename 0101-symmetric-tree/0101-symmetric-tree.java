class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // Case 1: both null
        if (t1 == null && t2 == null) return true;

        // Case 2: one null
        if (t1 == null || t2 == null) return false;

        // Case 3: values differ
        if (t1.val != t2.val) return false;

        // Mirror check
        return isMirror(t1.left, t2.right) &&
               isMirror(t1.right, t2.left);
    }
}