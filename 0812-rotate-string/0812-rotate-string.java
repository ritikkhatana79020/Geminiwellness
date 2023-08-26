class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()){
            return false;
        }
                
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        for(int i=0;i<s.length();i++){
            q1.add(s.charAt(i));
            q2.add(goal.charAt(i));
        }

        int k=s.length();
        while(k>0){
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if(q1.equals(q2)){
                return true;
            }
        }
    return false;
    }
}