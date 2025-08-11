// Last updated: 8/12/2025, 12:41:11 AM
class Solution {
    public ListNode oddEvenList(ListNode head) {
        //edge case
        if(head == null || head.next == null) return head;

        //initialization
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; //to save first even head, we are not saving first odd head as head already points to it

        //make odd indices point to odd and even to even
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        //assign even list after oddlist
        odd.next = evenHead;
        return head;
    }
}