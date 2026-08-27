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
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        int l1 = list1.val;
        int l2 = list2.val;
        ListNode head = new ListNode();
        if (l1 <= l2) {
            head.val = l1;
            list1 = list1.next;
        }
        else {
            head.val = l2;
            list2 = list2.next;
        }
        ListNode curr = head;
        while (list1 != null || list2 != null) {
            ListNode next = new ListNode();
            if (list1 == null) {
                l1 = -101;
            }
            else {
                l1 = list1.val;
            }
            if (list2 == null) {
                l2 = 101;
            }
            else {
                l2 = list2.val;
            }
            if (l1 <= l2 && l1 != -101) {
                System.out.print(list1.val);
                curr.next = next;
                next.val = l1;
                list1 = list1.next;
                
        }
            else if (l2 != 101) {
                curr.next = next;
                next.val = l2;
                list2 = list2.next;
        }
        curr = next;
        }
        return head;
    
    }
}