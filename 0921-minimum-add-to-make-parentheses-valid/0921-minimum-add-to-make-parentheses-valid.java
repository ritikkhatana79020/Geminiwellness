class Solution {
    public int minAddToMakeValid(String s) {
        
    Stack<Character> stk = new Stack<>();
      for (char ch : s.toCharArray()) {
        if (ch == ')') {
          if (!stk.isEmpty() && stk.peek() == '(') {
            stk.pop();
          } else {
            stk.push(ch);
          }
        } else {
          stk.push(ch);
        }
      }
      return stk.size(); 
        
    }
}