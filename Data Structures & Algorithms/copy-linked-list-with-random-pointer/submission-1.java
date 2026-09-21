/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> res=new HashMap<>();
        res.put(null,null);
        Node curr=head;

        while(curr!=null){
            if(!res.containsKey(curr)) res.put(curr,new Node(0));
            res.get(curr).val=curr.val;

            if(!res.containsKey(curr.next)) res.put(curr.next, new Node(0));
            res.get(curr).next=res.get(curr.next);
            
            if(!res.containsKey(curr.random)) res.put(curr.random, new Node(0));
            res.get(curr).random=res.get(curr.random);

            curr=curr.next;
        }
        return res.get(head);
    }
}
