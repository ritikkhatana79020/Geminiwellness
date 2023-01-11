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
    public boolean isPalindrome(ListNode head) {
        
        //Base Conditions
        if(head == null || head.next == null){
            return true;
        }
        
        // 3 Steps
        
        //Step 1 : find the mid -- slow-fast approach
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode midNode = slow;
        
        //Step 2 : Reverse the second half
        ListNode prev = null;
        ListNode curr = midNode;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode left = head;
        ListNode right = prev;
        
        //Step 3 : Compare left and right halfs
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right .next;
        }
        
        return true;
    }
}