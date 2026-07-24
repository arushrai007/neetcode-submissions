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
        int c=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            c++;
        }
        n=c-n;
        if(n==0){
             head=head.next;
             return head;
        }

        ListNode curr=head;
        for(int i=1;i<n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
