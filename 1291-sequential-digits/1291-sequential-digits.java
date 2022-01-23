class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        int lowLen = Integer.toString(low).length();
        int highLen = Integer.toString(high).length();
        
        List<Integer> ans = new ArrayList();
        
        for(int i=lowLen;i<=highLen;i++){
            for(int j=0;j<10-i;j++){
                int num = Integer.parseInt(digits.substring(j,j+i));
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        
        return ans;
    }
}