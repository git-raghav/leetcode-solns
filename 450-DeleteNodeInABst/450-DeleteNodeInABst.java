// Last updated: 8/12/2025, 12:41:04 AM
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null; //base case ki key nhi mili

        if(key < root.val) {
            root.left = deleteNode(root.left, key); //agr left m h toh delete krke return krdo
        }
        else if(key > root.val) {
            root.right = deleteNode(root.right, key); //agr right m h toh delete krke return krdo
        }
        else {
            //case 1 leaf node no child
            if(root.left == null && root.right == null) return null;

            //case 2 one child
            if(root.left == null) return root.right; //dono k liye already check karchuke h, ab sirf ek k liye dekhenge
            else if(root.right == null) return root.left;

            //case 3 both child present
            TreeNode node = findSuccessor(root.right); //successor right subtree m hoga to right subtree ka root bhejdo or dhundho
            root.val = node.val; //successor ki value se replace krdo current value
            root.right = deleteNode(root.right, node.val); //successor node ko delete krdo
        }
        return root;
    }

    public TreeNode findSuccessor(TreeNode node){
        while(node.left != null){ //leftmost node in right subtree hota h successor
            node = node.left;
        }
        return node;
    }
}