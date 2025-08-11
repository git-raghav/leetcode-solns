// Last updated: 8/12/2025, 12:41:44 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //base case
        if (head == null || head.next == null) return null;

        // detect cycle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 step
            // If the pointers meet, there is a cycle in the linked list.
            // Reset the slow pointer to the head of the linked list, and move both pointers one step at a time
            // until they meet again. The node where they meet is the starting point of the cycle.
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}