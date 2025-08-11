// Last updated: 8/12/2025, 12:41:38 AM
class Solution {
    public ListNode getMid(ListNode head ){
        ListNode slow = head;
        ListNode fast = head.next; // first middle in case of even number of nodes.

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // first middle
    }

    public ListNode sortList(ListNode head) {
        //base case
        if(head == null || head.next == null) return head;

        //find mid
        ListNode mid = getMid(head);

        //left and right halves mergesort
        ListNode rightHead = mid.next; // right half starts after mid
        mid.next = null; // break the list into two halves
        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public ListNode merge(ListNode head1, ListNode head2){
        //step 1 initialization
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;

        // Step 2: Compare nodes from both lists and attach the smaller one
        while (head1 != null && head2 != null) {
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        //Step 3 if element remains in any ll
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        //Step 4: Return the merged list, skipping the dummy node
        return mergedLL.next;
    }
}