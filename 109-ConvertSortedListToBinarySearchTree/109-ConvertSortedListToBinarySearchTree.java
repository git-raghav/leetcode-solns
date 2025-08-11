// Last updated: 8/12/2025, 12:41:52 AM
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        //base case
        if(head == null) return null; //list empty
        if(head.next == null) return new TreeNode(head.val); //single element

        //finding middle node and breaking into left and right half excluding middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; //to break the ll from head to middle-1
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; //break

        //creating tree
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }
}