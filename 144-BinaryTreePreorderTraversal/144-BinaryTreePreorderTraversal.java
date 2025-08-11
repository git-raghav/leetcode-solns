// Last updated: 8/12/2025, 12:41:41 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrderHelper(root, list);
        return list;
    }

    public void preOrderHelper(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        list.add(root.val);             // Visit root
        preOrderHelper(root.left, list);      // Left subtree
        preOrderHelper(root.right, list);     // Right subtree
    }
}