class Solution {
    public ListNode removeNodes(ListNode head) {
        head =  reverse(head);
        ListNode curr = head;

        while (curr.next != null){
            if (curr.next.val >= curr.val){
                curr = curr.next;
            }
            else curr.next = curr.next.next;
        }

        return reverse(head);
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}

