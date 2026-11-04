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
    public ListNode oddEvenList(ListNode head) {
        ListNode a = head;
        if (head == null || head.next == null) return head;
        ListNode b = head.next;
        ListNode c = b;
        while (a.next != null && b.next != null) {
            a.next = a.next.next;
            b.next = b.next.next;
            if (a.next == null) break;
            a = a.next;
            if (b.next == null) break;
            b = b.next;
        }
        b.next = null;
        a.next = c;
        return head;
    }
}