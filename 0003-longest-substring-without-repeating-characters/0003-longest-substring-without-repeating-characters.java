class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;

        int len=0;

        HashSet<Character> set = new HashSet<>();

        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
                len = Math.max(len,set.size());
            }
        }

        return len;
    }
}