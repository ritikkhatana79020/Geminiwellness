class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] ans = new int[nums.length];
        
        int sum = 0;
        for(int j=0;j<nums.length;j++){
            sum = sum + nums[j];
            ans[j] = sum;
        }
     
        return ans;
        
    }
}