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
    public ListNode rotateRight(ListNode head, int k) {
        // STEP 1 : Base Case
        if(head == null || head.next == null || k == 0) return head ;

        int size = 1 ;
        ListNode curr = head ;
        // STEP 2 : get size of the LinkedList 
        while(curr.next != null){
            curr = curr.next ;
            size++;
        }

        // STEP 3 : convert SLL to Circular LinkedList
        curr.next = head ;
        // STEP 4 : Decrease the Rotations
        k = k % size ;
        int steps = size - k ;

        // STEP 5 : Result
        while(steps > 0){
            curr = curr.next ;
            steps-- ;
        }
        head = curr.next ;
        curr.next = null ;

        return head ;

    }
}