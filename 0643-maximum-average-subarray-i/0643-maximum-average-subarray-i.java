class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int N=nums.length;
        double sum=0;
        double max=Double.NEGATIVE_INFINITY;

        while(j<N){
            //calculations
            sum=sum+(double)nums[j];


            if((j-i+1)<k){
                j++;
            }else if((j-i+1)==k){
                //store answer and move the window
                double avg = sum/k;
                max=Math.max(max,avg);

                sum=sum-nums[i];

                i++;
                j++;
            }
        }
        return max;
    }
}