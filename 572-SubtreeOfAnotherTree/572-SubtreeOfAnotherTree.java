// Last updated: 10/15/2025, 5:52:48 PM
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root == null) return false;
        if(root.val == subroot.val){
            if(isIdentical(root, subroot)) return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public boolean isIdentical(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;           // both null → match
        if (p == null || q == null) return false;          // one null → mismatch

        if (p.val != q.val) return false;                // values don’t match
        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right); // recursively check left and right subtrees
    }
}