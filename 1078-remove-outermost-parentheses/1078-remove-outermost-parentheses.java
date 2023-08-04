class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder("");
        StringBuilder str = new StringBuilder("");
        int count = 0;

        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));            
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }

            if(count==0){
                ans.append(str.toString().substring(1,str.length()-1));
                str.setLength(0);
            }

        }
        return ans.toString();
    }
}