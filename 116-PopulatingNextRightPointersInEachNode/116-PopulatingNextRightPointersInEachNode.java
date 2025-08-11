// Last updated: 8/12/2025, 12:41:51 AM
class Solution {
    public Node connect(Node root) {
        if (root == null) return root; //edge case
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.remove(); //remove

                if (curr.left != null) { //add child
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

                if(i == count-1) curr.next = null; //level ka last element h toh null point
                else curr.next = q.peek(); //agr koi or h toh uske right sibling jo ki queue ka first element h usko point
            }
        }
        return root;
    }
}