class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubString = 0;
        
        HashSet<Character> set=new HashSet<>();
        int left =0;
        int right = 0;

        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                longestSubString = Math.max(longestSubString,set.size());
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        return longestSubString;
    }
}