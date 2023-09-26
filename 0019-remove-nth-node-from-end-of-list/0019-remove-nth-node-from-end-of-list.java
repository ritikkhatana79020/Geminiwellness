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
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n==size){
            return head.next;
        }

        temp=head;
        int prev=size-n;
        int count = 1;
        while(count<prev){
            temp=temp.next;
            count++;
        }

        temp.next=temp.next.next;
        return head;

    }
}