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
        Node temp = head;
        HashMap<Node,Node> mapp = new HashMap<>();
        while(temp != null) {
            Node newNode = new Node(temp.val);
            mapp.put(temp,newNode);
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            Node copyNode = mapp.get(temp);
            copyNode.next = mapp.get(temp.next);
            copyNode.random = mapp.get(temp.random);
            temp = temp.next;
        }
        return mapp.get(head);
    }
}