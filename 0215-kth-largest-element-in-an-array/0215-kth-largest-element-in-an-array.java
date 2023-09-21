class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int ele : nums){
            minheap.add(ele);
            if(minheap.size()>k){
                minheap.remove();
            }
        }

        return minheap.peek();
    }
}