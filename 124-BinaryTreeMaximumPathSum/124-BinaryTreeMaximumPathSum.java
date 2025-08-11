// Last updated: 8/12/2025, 12:41:48 AM
class Solution {
    int sum;
    public int maxPathSum(TreeNode root) {
        sum = Integer.MIN_VALUE;
        find(root);
        return sum;
    }
    public int find(TreeNode root) {
        if(root == null) return 0;

        int left = Math.max(0, find(root.left));
        int right = Math.max(0, find(root.right));
        sum = Math.max(sum, left + right + root.val);

        return Math.max(left, right) + root.val;
    }
}