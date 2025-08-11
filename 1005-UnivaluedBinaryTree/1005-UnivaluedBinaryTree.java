// Last updated: 8/12/2025, 12:40:40 AM
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;

        if(root.left != null && root.val != root.left.val) return false;
        if(root.right != null && root.val != root.right.val) return false;

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}