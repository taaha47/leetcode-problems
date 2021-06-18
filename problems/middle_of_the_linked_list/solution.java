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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        
        while(fast != null) {
            fast = fast.next;
            if (i > 0 && i % 2 == 0) slow = slow.next;
            
            i++;
        }
        
        return i % 2 == 0 ? slow.next : slow;
    }
}