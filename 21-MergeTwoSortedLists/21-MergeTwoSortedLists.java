// Last updated: 8/12/2025, 12:42:16 AM
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //initialization
        ListNode mergedList = new ListNode(-1);
        ListNode temp = mergedList;

        //compare and merge
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        //if any element remains
        while(list1 != null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }

        return mergedList.next;
    }
}