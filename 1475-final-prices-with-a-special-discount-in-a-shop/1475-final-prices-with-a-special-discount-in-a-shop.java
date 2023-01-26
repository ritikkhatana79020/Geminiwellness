class Solution {
    public int[] finalPrices(int[] prices) {
        
    
        int[] ans = new int[prices.length];
        int next;
        
        for(int i=0;i<prices.length;i++){
            next = prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    next = prices[i]-prices[j];
                    break;
                }
            }
            ans[i] = next;
        }
      return ans;   
    }
}