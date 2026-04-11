// Leetcode(237)   Delete node of the Linked list 
 //Definition for singl y-linked list.
  public class ListNode {
   int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
 
class Solution {
    public void deleteNode(ListNode node) {
         
       node.val=node.next.val;
       node.next=node.next.next;
       
    }
}