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
    public ListNode sortList(ListNode head) {
        
        //Check Common Case First
        if(head == null || head.next == null){
            return head;
        }
        
        //Let's find the Medium of the Linked List, We will use slow-fast approach
        ListNode slow = head, fast= head, prev = head;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Let's break the LL from mid
        prev.next = null;
        
        return merge(sortList(head), sortList(slow));
        
        
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        } 
        if(l2 == null){
            return l1;
        }
        
        if(l1.val <= l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else{
            l2.next = merge(l1,l2.next);
            return l2;
        } 
    }
}