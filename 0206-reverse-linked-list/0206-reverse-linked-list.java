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
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null ;
        ListNode curr = head ;

        while(head != null){
            // STEP 1 : Move the head node 
            head = head.next ;
            // STEP 2 : Update the next of Curr 
            curr.next = newHead ;
            // STEP 3 : Update the newHead
            newHead = curr ;
            // STEP 4 : Update the Curr
            curr = head ;
        }

        return newHead ;
    }
}