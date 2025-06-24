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
    public ListNode mergeKLists(ListNode[] lists) {
        // Base cases :
        if(lists == null || lists.length == 0 ) return null ;

        int interval = 1 , n = lists.length ;

        while(interval < n){
            for(int i = 0 ; i+interval < n ; i=i+2*interval){
                lists[i] = merge(lists[i], lists[i+interval]);
            }
            interval = interval * 2 ;
        }
        return lists[0] ;
        
    }

    // Function --> Merging two sorted Linked List
    private ListNode merge(ListNode head1 , ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy ;

        while(head1 != null && head2 != null){
            // CASE 1 : Element in list 1 is lesser than list 2
            if(head1.val < head2.val){
                curr.next = head1 ;
                head1 = head1.next ;
            }
            // CASE 2 : Element in list 1 is greater than list 2
            else{
                curr.next = head2 ;
                head2 = head2.next ;
            }

            curr = curr.next ;
        }

        if(head1 == null) curr.next = head2 ;
        if(head2 == null) curr.next = head1 ;

        return dummy.next ;
    }
}