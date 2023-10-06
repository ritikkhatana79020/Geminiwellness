class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0]=1;
        right[n-1]=1;

        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        for(int i=n-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }

        return ans;
    }
}

// nums : [1,2,3,4]
// left : [1,_,_,_]
// right: [_,_,_,1]
// left : [1,1*1,1*2,2*3] : [1,1,2,6]
// right: [12*2,4*3,1*4,1]: [24,12,4,1] 
// ans  :                   [24,12,8,6] 
