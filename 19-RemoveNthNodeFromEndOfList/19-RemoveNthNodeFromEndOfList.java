// Last updated: 8/12/2025, 12:42:20 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //calc size
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        //edge case
        if(n == size){
            head = head.next;
            return head;
        }

        //removing
        ListNode prev = head;
        int i = 1;
        while(i < size-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}