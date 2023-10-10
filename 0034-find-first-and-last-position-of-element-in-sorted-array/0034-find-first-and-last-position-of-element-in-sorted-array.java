class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);

        return ans;
    }

    private int search(int[] nums, int target, boolean flag){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]==target){
                res=mid;
                if(flag){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
}