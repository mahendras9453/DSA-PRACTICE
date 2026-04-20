// GFg practise  Doubly linked list traverse

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    public Node reverse(Node head) {
        // code here
        Node current=head;
        Node prevNode = null;
        while( current!= null){
            prevNode=current.prev;
            current.prev=current.next;
             current.next=prevNode;
             current = current.prev;
        }
         if(prevNode!=null) head= prevNode.prev;
         return head;
        
    }
}