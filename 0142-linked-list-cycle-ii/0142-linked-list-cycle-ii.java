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
    public ListNode detectCycle(ListNode head) {
        // Base Case :
        if(head == null || head.next == null ) return null ;

        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;

            if(slow == fast){
                ListNode curr = head ;

                while(curr != slow){
                    curr = curr.next ;
                    slow = slow.next ;
                }
                return curr ;
            }
        }
        return null ;
    }
}