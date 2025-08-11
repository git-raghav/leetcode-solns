// Last updated: 8/12/2025, 12:41:55 AM
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.remove(); //remove
                sublist.add(curr.val); //print

                if (curr.left != null) { //add child
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            list.add(sublist);
        }
        return list;
    }
}