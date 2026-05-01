// leet code (817 )  LL components 
import java.util.*;
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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        
        int count= 0;
        boolean inComponent=false;

        while (head != null) {
            if(set.contains(head.val)){
                
                if(!inComponent) {
                    count++;          
                    inComponent = true;
                }
            } 
            else  inComponent=false;
              
               
            
            head=head.next;
        }

        return count;
    }
}