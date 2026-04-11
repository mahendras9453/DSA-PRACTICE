// GFG problem LL insertion at any position
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newNode=new Node(val);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node temp=head;
     for(int i=1; temp!=null && i<pos-1;i++){
         temp=temp.next;
         
     }
     if(temp==null){
         return head;
     }
     newNode.next=temp.next;
     temp.next=newNode;
     return head;
    }
}