class Solution {
    public void nextPermutation(int[] nums) {
        
        int ind = -1;
        
        for(int i=nums.length-2;i>=0;i--){
            
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
            
        }
        
        if(ind == -1){
            reverse(nums,0,nums.length-1);
        }else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[ind]<nums[i]){
                    swap(nums,ind,i);
                    break;
                }
            } 
        reverse(nums,ind+1,nums.length-1);
        }
        
        
    }
    
    public void swap(int[] A, int i, int j) {
       int tmp = A[i];
       A[i] = A[j];
       A[j] = tmp;
    }

    void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }
}