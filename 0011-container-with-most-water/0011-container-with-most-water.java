class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int max = 0;
        int h = height[i];
        while(i<j){
            h = Math.min(height[i],height[j]);
            int area = h*(j-i);
            max = Math.max(area,max);

            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}