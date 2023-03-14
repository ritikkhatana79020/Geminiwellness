class Solution {
    public void nextPermutation(int[] nums) {
        
        int n= nums.length;
        int k = n - 2;
        
        //null check
        if(nums.length == 0 || nums==null){
            return;
        }
        
        //find k
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                k--;
            }else{
                break;
            }
        }
        
        
        
        //if k==-1 reverse the array and return
        if(k==-1){
            reverse(nums,0,n-1);
            return;
        }
        
        //swap the k with next greater
        for(int i=n-1;i>k;i--){
            if(nums[i]>nums[k]){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        
        
        //reverse the array from k+1 to end
        reverse(nums,k+1,n-1);
        
        
    }
    
    public void reverse(int nums[], int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}