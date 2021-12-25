class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        int right = 1;
        int left = 1;
        int len = nums.length;
        
        for(int i=len-1;i>=0;i--){
            ans[i]=right;
            right = right*nums[i];
        }
        for(int j=0;j<nums.length;j++){
            ans[j]=ans[j]*left;
            left = left*nums[j];
        }
        return ans;
    }
}