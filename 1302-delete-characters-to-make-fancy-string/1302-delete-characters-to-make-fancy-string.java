class Solution {
    public String makeFancyString(String s) {
        char prev = s.charAt(0);
        int count = 1;

        StringBuilder ans = new StringBuilder();
        ans.append(prev);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev){
                count++;
            }else{
                prev=s.charAt(i);
                count=1;
            }
            if(count<3){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}