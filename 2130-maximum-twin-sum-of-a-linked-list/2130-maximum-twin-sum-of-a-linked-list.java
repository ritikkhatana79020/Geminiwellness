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
    public int pairSum(ListNode head) {
        int size = 0;
        
        ListNode dummy = head;
        ListNode storeVal = head;
        
        while(dummy.next!=null){
            size++;
            dummy=dummy.next;
        }
        
        int[] arr = new int[size+1];
        
        int j=0;
        
        while(storeVal.next!=null){
            arr[j]=storeVal.val;
            j++;
            storeVal=storeVal.next;
        }
        
        arr[j] = storeVal.val;
        
        int max = 0;
        
        for(int i=0;i<arr.length/2;i++){
            int sum = arr[i]+arr[arr.length-1-i];
            max = Math.max(sum,max);
        }
        
        return max;
        
    }
}