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
        if(null==head)return false;

        ListNode s=head;
        ListNode f=head;

        while(null!=f && null!=f.next){
            s=s.next;
            f=f.next.next;

            if(s==f){return true;}
        }return false;
    }
}
