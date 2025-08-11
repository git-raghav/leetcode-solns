// Last updated: 8/12/2025, 12:41:15 AM
import java.util.*;
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        paths(root, sb, result);
        return result;
    }

    private void paths(TreeNode root, StringBuilder path, List<String> result) {
        if (root == null) return; // Base case: no node, stop recursion
        
        int len = path.length(); // Save current length of path (for backtracking later)
        if (len > 0) path.append("->");
        path.append(root.val);

        if (root.left == null && root.right == null) { //If it's a leaf node
            result.add(path.toString());
        } else {
            paths(root.left, path, result);
            paths(root.right, path, result);
        }
        path.setLength(len); // Backtrack: remove the part we added for the current node
    }
}