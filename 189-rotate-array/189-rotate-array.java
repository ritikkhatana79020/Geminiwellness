class Solution {
    public void rotate(int[] nums, int k) {
        
        k=k%nums.length;
        
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
    }
    
    void reverse(int[] nums, int s, int e){
        
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            
            s++;
            e--;
        }
    }
}