/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Moving both data and pointer to the next One
        node.val = node.next.val;
        node.next = node.next.next ;
    }
}