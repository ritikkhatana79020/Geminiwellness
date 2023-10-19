class Solution {
    public void sortColors(int[] nums) {
        
        for(int counter = 0;counter<nums.length-1;counter++){
            for(int j=0;j<nums.length-counter-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}