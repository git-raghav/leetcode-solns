// Last updated: 8/12/2025, 12:41:01 AM
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        //edge cases emptylist, one element, same node, k bigger then list
        if(head == null || head.next == null) return head;
        int size  = getSize(head);
        if(k > size || k == size-k+1) return head;

        //step 1: initialize
        ListNode dummy = new ListNode(0);//avoids special handling for head
        dummy.next = head;
        ListNode prevLeft = dummy;
        ListNode left = head;
        ListNode prevRight = dummy;
        ListNode right = head;

        //step 2: find the k-th node and kth last node
        for(int i = 1; i < k; i++){
            prevLeft = prevLeft.next;
            left = left.next;
        }
        for(int i = 1; i < size-k+1; i++){
            prevRight = prevRight.next;
            right = right.next;
        }

        //step 3 swapping
        //case 1 left is rights previous
        if(left == prevRight){
            left.next = right.next;
            prevLeft.next = right;
            right.next = left;
        } else if(right == prevLeft){ //case 2 right is lefts previous
            right.next = left.next;
            prevRight.next = left;
            left.next = right;
        } else { //normal cases not adjacent
            ListNode temp = left.next;
            prevLeft.next = right;
            left.next = right.next;
            prevRight.next = left;
            right.next = temp;
        }

        //step 4 update head
        return dummy.next;
    }

    public int getSize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}