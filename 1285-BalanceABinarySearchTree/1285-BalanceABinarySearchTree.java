// Last updated: 8/12/2025, 12:40:35 AM
class Solution {
    private List<TreeNode> list = new ArrayList<>(); //global variable

    public TreeNode balanceBST(TreeNode root) {
        inOrder(root); //inorder traversal to convert bst to sorted arraylist
        return create(0, list.size() - 1);
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }

    // sorted arraylist ko bst code same as sorted array to bst
    private TreeNode create(int low, int high) {
        if (low > high) return null; //base case

        int mid = low + (high - low) / 2;
        TreeNode root = list.get(mid); //node create
        root.left = create(low, mid - 1); // left ki node banao
        root.right = create(mid + 1, high); // right ki node banao

        return root;
    }
}
// step 1- inorder se sorted arraylist banao
// step 2- arraylist se vapis se bst banao mid krke