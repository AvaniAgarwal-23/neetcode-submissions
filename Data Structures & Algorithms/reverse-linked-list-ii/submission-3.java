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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode n=new ListNode(0);
        n.next=head;
        ListNode x=n;
        if(head==null||left==right){
            return head;
        }
        for(int i=1;i<left;i++){
            x=x.next;
        }
        ListNode temp=x.next;
        for(int i=0;i<right-left;i++){
            ListNode y=temp.next;
            temp.next=y.next;
            y.next=x.next;
            x.next=y;
        }
        return n.next;
    }
}