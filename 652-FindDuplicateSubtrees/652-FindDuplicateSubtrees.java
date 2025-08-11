// Last updated: 8/12/2025, 12:40:57 AM
class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, List<TreeNode>> map = new HashMap<>();
        traverse(root, map);
        List<TreeNode> result = new ArrayList<>();
        for (Map.Entry<String, List<TreeNode>> entry : map.entrySet()) {
            List<TreeNode> nodes = entry.getValue();
            if (nodes.size() > 1) {
                result.add(nodes.get(0));
            }
        }
        return result;
    }

    private String traverse(TreeNode node, Map<String, List<TreeNode>> map) {
        if (node == null) {
            return "#";
        }
        String left = traverse(node.left, map);
        String right = traverse(node.right, map);
        String serialized = node.val + "," + left + "," + right;
        List<TreeNode> nodes = map.getOrDefault(serialized, new ArrayList<>());
        nodes.add(node);
        map.put(serialized, nodes);
        return serialized;
    }
}