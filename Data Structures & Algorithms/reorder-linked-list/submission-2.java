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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode low=head;
        ListNode ft=head;
        while(ft!=null&&ft.next!=null){
            low=low.next;
            ft=ft.next.next;
        }
        ListNode temp=null;
        ListNode t=low;
        ListNode end=null;
        while(t!=null){
            temp=t.next;
            t.next=end;
            end=t;
            t=temp;
        }
        ListNode l=head;
        while(end.next!=null){
            ListNode temp1=l.next;
            ListNode temp2=end.next;
            l.next=end;
            end.next=temp1;
            l=temp1;
            end=temp2;
        }
    }
}
