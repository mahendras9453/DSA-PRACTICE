//  leet code (21) merge two sorted list 
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 =list1;
        ListNode temp2=list2;
        ListNode dummy = new ListNode(-1);
        ListNode start= dummy;
        while(temp1!=null && temp2!=null ){
            if(temp1.val<=temp2.val){
                start.next=temp1;
                temp1=temp1.next;
            }
            else{
                start.next=temp2;
                temp2=temp2.next;
            }
            start=start.next;
            
        }
        if(temp1!=null)  start.next=temp1;
         if(temp2!=null)  start.next=temp2;

        return dummy.next;
    }
}