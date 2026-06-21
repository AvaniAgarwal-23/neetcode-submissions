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
        ListNode x=head;
        ListNode y=head;
        int count=0;
        while(x!=null){
            x=x.next;
            count++;
        }
        if(count==n){
            return head.next;
        }
        for(int i=1;i<count-n;i++){
            y=y.next;
        }
        y.next=y.next.next;
        return head;
    }
}
