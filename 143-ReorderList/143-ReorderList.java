// Last updated: 8/12/2025, 12:41:42 AM
class Solution {
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next; // first middle in case of even number of nodes.

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // first middle
    }

    public void reorderList(ListNode head) {
        //find mid
        ListNode mid = getMid(head);

        //2nd half reverse
        ListNode prev = null;
        ListNode curr = mid.next;
        mid.next = null; //1st half k last element ko bhi null point karvado

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode left = head; //left head
        ListNode right = prev; //right head

        //alternate merging
        ListNode nextLeft, nextRight;
        while (left != null && right != null) {
            //simulation
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;
            
            //updation
            left = nextLeft;
            right = nextRight;
        }
    }
}