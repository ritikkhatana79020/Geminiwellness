class Solution {
    public boolean canBeValid(String s, String locked) {
        
        if(s.length()%2!=0){
            return false;
        }
        
        int open1=0;
        int close1=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || locked.charAt(i) == '0' ){
                open1++;
            }else{
                close1++;
            }
            if(close1>open1){
                return false;
            }
        }
        
        int open2=0;
        int close2=0;
        
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i) == ')' || locked.charAt(i) == '0' ){
                close2++;
            }else{
                open2++;
            }
            if(close2<open2){
                return false;
            }
        }
        return true;
    }
}