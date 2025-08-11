// Last updated: 8/12/2025, 12:41:32 AM
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.remove(); //remove
                if(i == count-1) list.add(curr.val); //print

                if (curr.left != null) { //add child
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return list;
    }
}