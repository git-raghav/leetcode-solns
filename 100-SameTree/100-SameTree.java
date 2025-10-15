// Last updated: 10/15/2025, 5:53:48 PM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;           // both null → match
        if (p == null || q == null) return false;          // one null → mismatch
        if (p.val != q.val) return false;                // values don’t match

        // recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}