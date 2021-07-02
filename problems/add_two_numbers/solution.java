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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        ListNode result = new ListNode(0, current);
        
        int carrier = 0;
        
        while (l1 != null || l2 != null) {
            int res = l1 != null ? l1.val : 0;
            res = res + (l2 != null ? l2.val : 0);
            res = res + carrier;
            carrier = res > 9 ? 1 : 0;
            res = res > 9 ? res % 10 : res;
            
            ListNode resNode = new ListNode(res);
            current.next = resNode;
            
            current = resNode;
            
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        
        if (carrier > 0) current.next = new ListNode(carrier);
        
        return result.next.next;
    }
}