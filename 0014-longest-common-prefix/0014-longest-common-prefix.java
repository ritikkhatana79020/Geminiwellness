class Solution {

    public String common(String s1, String s2){

        int len = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for(int i=0;i<strs.length;i++){
            res=common(res,strs[i]);
        }

        return res;
    }
}