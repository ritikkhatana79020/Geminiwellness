/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode check = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                while(check != slow){
                    slow = slow.next;
                    check = check.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}