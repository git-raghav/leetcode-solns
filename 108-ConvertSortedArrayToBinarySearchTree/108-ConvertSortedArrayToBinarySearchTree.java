// Last updated: 8/12/2025, 12:41:54 AM
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
    }
    private TreeNode create(int nums[], int low, int high) {
        if (low > high) return null; //base case

        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[mid]); //node create
        root.left = create(nums, low, mid - 1); // left ki node banao
        root.right = create(nums, mid + 1, high); // right ki node banao

        return root;
    }
}