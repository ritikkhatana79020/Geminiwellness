class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        
        int l = 0;
        int r = arr.length - 1;
        
        while(l<arr.length-1){
            if(arr[l]<arr[l+1]){
                l++;
            }else{
                break;
            }
        }
        
        if(l==arr.length-1){
            return false;
        }
        
        while(r>0){
            if(arr[r]<arr[r-1]){
                r--;
            }else{
                break;
            }
        }
        
        if(r==0){
            return false;
        }
        
        return l==r;
    }
}