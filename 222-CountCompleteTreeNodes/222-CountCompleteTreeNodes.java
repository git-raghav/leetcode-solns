// Last updated: 8/12/2025, 12:41:27 AM
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0; //base case
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }
}