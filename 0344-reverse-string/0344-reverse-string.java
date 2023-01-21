class Solution {
    public void reverseString(char[] s) {
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0;i<s.length;i++){
            stk.push(s[i]);
        }
        int j=0;
        while(!stk.isEmpty()){
            s[j++] = stk.pop();
        }
    }
}