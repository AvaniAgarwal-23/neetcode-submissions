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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> ll= new HashSet<>();
        while(head!=null){
            if(ll.contains(head)){
                return true;
            }
            else{
                ll.add(head);
                head=head.next;
            }
        }
        return false;
    }
}
