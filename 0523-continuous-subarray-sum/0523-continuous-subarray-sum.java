class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int prev=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(set.contains(sum%k)){
                return true;
            }
            set.add(prev);
            prev=sum%k;
        }

        return false;
    }
}