
//GFG problem Introduction to DLL
class Node {
    int data;
    Node next;
    Node prev;   // must be declared

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
class Solution {
    Node constructDLL(int arr[]) {
    
        // Code here
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node current = head;
        for(int i=1;i<arr.length;i++){
            Node newNode= new Node(arr[i]);
            current.next=newNode;
            newNode.prev=current ;
           
            current=newNode;
        }
        
        return head;
    }
}