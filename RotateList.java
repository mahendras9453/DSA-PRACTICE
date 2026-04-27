// leetcode (61) Rotate LIst
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
        k=k%len;
        int newHeadpos=len-k;
        ListNode newhead=head;
        for(int i=1; i<newHeadpos;i++){
            newhead=newhead.next;

        }
        ListNode start=newhead.next;
        newhead.next=null;
        return start;
    }
}