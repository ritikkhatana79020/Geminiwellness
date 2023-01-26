class Solution {
    public int[] finalPrices(int[] prices) {
        
        Stack<Integer> stk = new Stack<>();
        int size = prices.length;
        int[] ans = new int[size];
        
        for(int i=size-1;i>=0;i--){
            
            while(!stk.isEmpty() && stk.peek()>prices[i]){
                stk.pop();
            }
            
            if(stk.isEmpty()){
                ans[i] = prices[i];
            }else{
                ans[i] = prices[i] - stk.peek(); 
            }
            stk.push(prices[i]);
        }
        return ans;
    }
}