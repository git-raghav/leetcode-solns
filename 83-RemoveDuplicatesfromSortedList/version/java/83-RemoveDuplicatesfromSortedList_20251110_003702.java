// Last updated: 11/10/2025, 12:37:02 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        //edge case
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        while(temp != null && temp.next != null){
            ListNode curr = temp.next;
            while(curr != null && temp.val == curr.val){
                curr = curr.next;
            }
            temp.next = curr;
            temp = temp.next;
        }
        return head;
    }
}