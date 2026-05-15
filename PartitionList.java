// leetcode (86) Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(-1);
        ListNode smallpo= small;
        ListNode large=new ListNode(-1);
        ListNode largepo= large;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                smallpo.next= new ListNode(temp.val);
                smallpo=smallpo.next;
            }
            else{
                largepo.next=new ListNode(temp.val);
                largepo=largepo.next;
                
            }
            temp=temp.next;
        }
        largepo.next=null;
        smallpo.next=large.next;
        return small.next;

    }
}