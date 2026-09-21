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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode();
        ListNode curr=res;
        int carry=0;
        while(null!=l1 || null!=l2 || 0!=carry){
            int v1=(null!=l1) ? l1.val : 0;
            int v2=(null!=l2) ? l2.val : 0;

            int val=v1+v2+carry;
            carry=val/10;
            val%=10;
            curr.next=new ListNode(val);

            curr=curr.next;
            l1=(null!=l1) ? l1.next : null;
            l2=(null!=l2) ? l2.next : null;
        }
        return res.next;
    }
}
