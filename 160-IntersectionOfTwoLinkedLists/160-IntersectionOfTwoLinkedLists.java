// Last updated: 8/12/2025, 12:41:37 AM
public class Solution {
    public int getsize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //edge case both list empty
        if(headA == null || headB == null) return null;

        //calc size
        int lenA = getsize(headA);
        int lenB = getsize(headB);

        //same position p leke aajao pointers ko
        ListNode a = headA; //list A pointer
        ListNode b = headB; //list B pointer

        while(lenA > lenB){
            lenA--;
            a = a.next;
        }
        while(lenA < lenB){
            lenB--;
            b = b.next;
        }

        //now both pointers are at same distance from intersection, move both together till they are equal
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
}