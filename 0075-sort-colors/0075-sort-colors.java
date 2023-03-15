class Solution {
    public void sortColors(int[] nums) {
        
        int zero = 0;
        int second = nums.length-1;
        
        int i=0;
        while(i<=second){
            
            if(nums[i]==0){
                swap(nums,i,zero);
                zero++;
                i++;
            }else if(nums[i]==2){
                swap(nums,i,second);
                second--;
            }else{
                i++;
            }
            
            
        }
        
    }
    
    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}