class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     
        //i points to the last number other the zero in the nums1
        //for array {1,4,6,0,0,0} so, here i points to number 6 
        int i = m-1;
        
        //j points to the last index of nums2
        int j = n-1;
        
        //k points to the last index of nums1
        int k = m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
        
    }
}