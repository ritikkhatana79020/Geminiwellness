class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                if(stk.size()>0){
                    ans.append(s.charAt(i));
                }
                stk.push(s.charAt(i));

            }else{
                stk.pop();
                if(stk.size()>0){
                    ans.append(s.charAt(i));
                }
            }

        }
        return ans.toString();
    }
}