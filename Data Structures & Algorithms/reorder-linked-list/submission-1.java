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
    public void reorderList(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
      
        fast = fast.next.next;
        
       } 
       ListNode list1 = head;
       ListNode list2 = slow.next;
       slow.next = null;
       ListNode prev = null;
       ListNode curr = list2;
       ListNode next;

       while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       list2 = prev;
       while (list1 != null && list2 != null) {
        ListNode next1 = list1.next;
        ListNode next2 = list2.next;
        list1.next = list2;
        list2.next = next1;
        list1 = next1;
        list2 = next2;
       }
    }
}
