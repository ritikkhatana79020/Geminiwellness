class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<n;i++){
            if(stk.isEmpty()){
                stk.push(i);
                left[i] = 0;
            }else{
                while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                    stk.pop();
                }
                left[i] = stk.isEmpty()?0:stk.peek()+1;
                stk.push(i);
            }
        }
        stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(stk.isEmpty()){
                stk.push(i);
                right[i] = n-1;
            }else{
                while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                    stk.pop();
                }
                right[i] = stk.isEmpty()?n-1:stk.peek()-1;
                stk.push(i);
            }
        }
        
        int maxArea = Integer.MIN_VALUE;
        int[] area = new int[n];
        for(int i=0;i<n;i++){
            area[i] = heights[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(maxArea,area[i]);
        }
        
        return maxArea;
    }
}