// Last updated: 8/12/2025, 12:41:00 AM
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int max[] = new int[1]; //for pass by reference
        findHeight(root, max);
        return max[0]-1;
    }
    public static int findHeight(TreeNode root, int max[]) {
        if(root == null) return 0;

        // get left and right heights recursively
        int leftHeight = findHeight(root.left, max);
        int rightHeight = findHeight(root.right, max);

        // path through this node = left + right + 1
        max[0] = Math.max(max[0], leftHeight + rightHeight + 1);

        // return height of this node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}