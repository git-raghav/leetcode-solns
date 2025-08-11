// Last updated: 8/12/2025, 12:40:56 AM
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;

        if(val < root.val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }
}