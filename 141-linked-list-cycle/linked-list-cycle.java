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
        Set<ListNode> visited = new HashSet<>();
        ListNode curr_node = head;

        while (curr_node != null) {
            if (visited.contains(curr_node)) {
                return true;
            }
            visited.add(curr_node);
            curr_node = curr_node.next;
        }
        return false;

    }
}