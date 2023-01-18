class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        if(arr.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;
        
        int target = 0;
        while(start < end){
            
            int mid = start + (end-start)/2;
            
            target = arr[mid+1];
            if(target<arr[mid]){
                end = mid; 
            }else if(target>arr[mid]){
                start = mid+1;
            }
        }
        return end;
    }
}