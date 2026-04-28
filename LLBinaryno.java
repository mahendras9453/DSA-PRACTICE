// leetcode(1290)  convert the binary number in linked list to intger
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
    public int getDecimalValue(ListNode head) {
        
        int result = 0;
        ListNode current = head;
  while(current != null) {
            
            if(current.val == 0) {
                result= result * 2;
            }
           
            else {
                result= result * 2 + 1;
            }

            current=current.next;
        }
        return result;
    }
}