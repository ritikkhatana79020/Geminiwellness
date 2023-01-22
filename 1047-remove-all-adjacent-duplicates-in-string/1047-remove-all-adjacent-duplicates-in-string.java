class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char top = s.charAt(i); 
            
            if(!stk.isEmpty() && stk.peek() == top){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        
        return String.valueOf(sb.reverse());
        
    }
}