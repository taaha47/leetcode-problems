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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode node = head;
        
        while (node != null) {
            nodes.add(node);
            node = node.next;
        }
        
        int size = nodes.size();
        int pos = size - n;
        
        if (pos == 0 && size == 1) return null;
        else if (pos == 0) return nodes.get(1);
        else if (pos == size - 1) nodes.get(pos - 1).next = null;
        else nodes.get(pos - 1).next = nodes.get(pos + 1);
        
        return nodes.get(0);
    }
}