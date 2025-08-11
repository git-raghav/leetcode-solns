// Last updated: 8/12/2025, 12:41:39 AM
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    public void helper(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}