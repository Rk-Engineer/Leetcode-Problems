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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head ;
        ListNode prev = null ;
        while(curr != null){
            // CASE 1 : head node matches Val
            if(head.val == val){
                head = head.next;
                curr = head ;
            }
            // CASE 2 : Middle or last matches Val
            else if(curr.val == val){
                prev.next = curr.next ;
                curr = curr.next ;
            }
            // CASE 3 : Move both curr and prev
            else{
                prev = curr ;
                curr = curr.next ;
            }
        }
        return head ;
    }
}