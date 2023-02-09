class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int[] width = new int[heights.length];
        int[] area = new int[heights.length];
        
        Stack<Integer> stk = new Stack<>();
        
        nsl(left,stk,heights);
        stk.clear();
        nsr(right,stk,heights);
        
        int max = 0;
        
        for(int i=0;i<heights.length;i++){
            width[i] = right[i] - left[i] - 1;
            area[i] = width[i] * heights[i];
            if(area[i]>max){
              max=area[i];  
            } 
        }
        
        return max;
    }
    
    private void nsl(int[] left, Stack<Integer> stk, int[] heights){
        for(int i = 0; i < heights.length; i++) {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                stk.pop();
            if(stk.isEmpty())
                left[i] = -1;
            else if(heights[stk.peek()] < heights[i])
                left[i] = stk.peek();
            stk.push(i);
        }
    }
    
    private void nsr(int[] right, Stack<Integer> stk, int[] heights){
        for(int i = heights.length - 1; i >= 0; i--) {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                stk.pop();
            if(stk.isEmpty()) 
                right[i] = heights.length;
            else if(heights[stk.peek()] < heights[i]) 
                right[i] = stk.peek();
            stk.push(i);
    }
}
}