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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head ;
        while(curr != null){
            // Step 1 : check right side value is greater 
            while(!stack.isEmpty() && stack.peek().val < curr.val){
                stack.pop();
            }
            stack.add(curr);
            curr = curr.next ;
        }
        // Step 2 : Create a new RESULT Linked List
        ListNode newHead = null ;
        while (!stack.isEmpty()){
            ListNode temp = stack.pop();
            temp.next = newHead ;
            newHead = temp ;
        }
        return newHead ;
    }
}