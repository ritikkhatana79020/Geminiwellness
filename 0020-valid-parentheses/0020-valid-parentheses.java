class Solution {
    public boolean isValid(String s) {
        
        
        Stack<Character> stk = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else{
                if(ch == ')'){
                    if(stk.isEmpty() || stk.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(stk.isEmpty() || stk.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(stk.isEmpty() || stk.pop() != '['){
                        return false;
                    }
                }
            }
        }
        
        return stk.isEmpty();
    }
}