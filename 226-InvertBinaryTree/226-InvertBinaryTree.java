// Last updated: 8/12/2025, 12:41:24 AM
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}