class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            
            if(sum > max){
                ans.add(sum);
                max=sum;
            }
            
            if(sum<0){
                sum =0;
            }
        }
        
        return max;
    }
}