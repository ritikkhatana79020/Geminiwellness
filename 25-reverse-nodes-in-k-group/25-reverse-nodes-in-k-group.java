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
    public ListNode reverseKGroup(ListNode head, int k) {
        
    
    //step1: reverse first k nodes
    ListNode curr = head;
    ListNode prev = null;
    ListNode tmp;
    int count= 0;
        
    //Length lakar dega    
    while(curr!=null && count<k){
        count++;
        curr = curr.next;
    }  
   
    if(count<k){
       return head;
    }  
        
    curr = head;
    count = 0;    
        
      
    
    while(count < k ) {
        tmp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = tmp;
        count++;
    }
    
    //step2: Recursion dekhlega aage ka 
    head.next = reverseKGroup(curr,k);
  
    
    //step3: return head of reversed list
    return prev;
        
    }
}