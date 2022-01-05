class Solution {
    public int findMin(int[] nums) {
        
        int start  = 0;
        int end = nums.length -1;
        int N = nums.length;
        
        if(N==1){
            return nums[0];
        }
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            int next = (mid+1)%N;
            int prev = (mid+N-1)%N;    
            
            if(nums[mid]<nums[next] && nums[mid]<nums[prev]){
                return nums[mid];
            }else if(nums[end]<nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1 ;
            }
            
        }
        return -1;
    }
}