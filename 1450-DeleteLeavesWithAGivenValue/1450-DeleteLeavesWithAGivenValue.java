// Last updated: 8/12/2025, 12:40:31 AM
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.val == target && root.left == null && root.right == null) return null;
        return root;
    }
}