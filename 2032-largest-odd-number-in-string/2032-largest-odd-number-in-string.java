class Solution {
    public String largestOddNumber(String num) {
       
        int len = num.length();
        
        for(int i=len-1;i>=0;i--){
            int lastdigit = num.charAt(i);
            if(lastdigit%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}