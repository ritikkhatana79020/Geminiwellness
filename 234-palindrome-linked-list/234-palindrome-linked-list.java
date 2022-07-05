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
    
    ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if(fast!=null){
            return slow.next;
        }
        
        return slow;
    }
    
    ListNode reverse(ListNode node){
        ListNode prev = null;
        
        while(node!=null){
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        
        while(rev!=null){
            if(head.val != rev.val){
                return false;
            }else{
                head = head.next;
                rev = rev.next;
            }
        }
        return true;
    }
}