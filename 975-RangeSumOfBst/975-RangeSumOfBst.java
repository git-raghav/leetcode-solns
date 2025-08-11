// Last updated: 8/12/2025, 12:40:42 AM
class Solution {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return sum;

        if (low <= root.val && root.val <= high) {
            sum += root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        } 
        else if (root.val < low) {
            rangeSumBST(root.right, low, high);
        } 
        else {
            rangeSumBST(root.left, low, high);
        }
        
        return sum;
    }
}