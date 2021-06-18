/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        int pos = 0;
        
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next.next;
            slow = slow.next;
            
            if (fast == slow) return true;
        }
        
        return false;
    }
}