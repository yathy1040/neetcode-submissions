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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();

        if (list1 == null && list2 == null) {
            return null;
        }
        else if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }
        ListNode l1I = list1;
        ListNode l2I = list2;
        ListNode newListI = dummy;
        while (l1I != null && l2I != null) {
            if (l1I.val <= l2I.val) {
                newListI.next = l1I;
                l1I = l1I.next;
                newListI = newListI.next;
            }
            else {
                newListI.next = l2I;
                l2I = l2I.next;
                newListI = newListI.next;
            }
        }
        if (l1I == null && l2I == null) {
            return dummy.next;
        }
        else if (l1I == null) {
            while (l2I != null) {
                newListI.next = l2I;
                l2I = l2I.next;
                newListI = newListI.next;
            }
        }
        else {
            while (l1I != null) {
               newListI.next = l1I;
                l1I = l1I.next;
                newListI = newListI.next;
            }
        }
        return dummy.next;
    }
}