// GFG problem Linked list Insertion At End 
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    public Node insertAtEnd(Node head, int x) {
       Node newNode=new Node(x);
       if(head==null){
           newNode.next=head;
           return newNode;
       }
       else{
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=newNode;
           
           
       }
       return head;
        
    }
}