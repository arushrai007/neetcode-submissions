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
    public ListNode mergeTwoLists(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(left!=null && right!=null){
            if(left.val>right.val){
                curr.next=right;
                right=right.next;
            }
            else{
                curr.next=left;
                left=left.next;
            }
            curr=curr.next;
        }
        curr.next = (left!=null) ? left:right;
        return dummy.next;

    }
    }
