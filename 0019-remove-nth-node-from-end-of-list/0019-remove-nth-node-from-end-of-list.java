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
        

        //Calculate the size
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        //Edge case : It means we need to delete first node
        if(n==size){
            return head.next;
        }

        temp=head;
        int count=1;
        int prevNode =size-n;

        while(count<prevNode){
            temp=temp.next;
            count++;
        }

        temp.next=temp.next.next;

        return head;


    }
}