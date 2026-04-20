// leetcode(19)  remove nth node from end of the linked list
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head==null ) return head;
        int count=0;
        ListNode temp=head;
        while(temp!=null ){
            count++;
            temp= temp.next;
        }
        int m=count-n;
     temp=head;
     if(m==0) return head.next;
     for(int i=0;i<m-1;i++){
        temp=temp.next;
     }
     temp.next= temp.next.next;


return head;
    }
}