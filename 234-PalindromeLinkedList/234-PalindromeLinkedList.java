// Last updated: 8/12/2025, 12:41:21 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //edge case
        if (head == null || head.next == null) {
            return true;
        }

        // step 1- find midnode
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // step 2- reverse 2nd half
        ListNode prev = null;
        ListNode curr = slow;//midnode

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev; //right head
        ListNode left = head; //left head

        // step 3- check both halves
        while (right != null) {
            if(left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}