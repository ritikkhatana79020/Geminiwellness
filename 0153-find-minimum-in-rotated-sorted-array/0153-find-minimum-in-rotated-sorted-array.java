class Solution {
    public int findMin(int[] nums) {
        int N = nums.length;
        int start = 0;
        int end = N-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid+N-1)%N;
            int next = (mid+1)%N;

            if(N==1){
                return nums[0];
            }

            if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                return nums[mid];
            }else if(nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}