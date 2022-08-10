class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length; 
        int[] ans = new int[2*nums.length];
        
        
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];   //i=0
            ans[i+n] = nums[i]; 
        }
        
        return ans;
        
    }
}