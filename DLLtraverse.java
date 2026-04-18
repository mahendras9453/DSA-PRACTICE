// GFG Doubly linked list Traverse
import java.util.*;
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        ArrayList<Integer>  res= new ArrayList<>();
        Node temp=head;
        while(temp!=null){
           res.add(temp.data);
            temp=temp.next;
    
        }
        return res;
        
    
    }
}