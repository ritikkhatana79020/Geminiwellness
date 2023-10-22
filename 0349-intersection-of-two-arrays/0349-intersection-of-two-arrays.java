class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums1){
            set.add(ele);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for(int ele : nums2){
            if(set.contains(ele)){
                intersection.add(ele);
            }
        }

        int[] ans = new int[intersection.size()];
        
        int i = 0;

        for(int ele : intersection){
            ans[i]=ele;
            i++;
        }

        return ans;
    }
}