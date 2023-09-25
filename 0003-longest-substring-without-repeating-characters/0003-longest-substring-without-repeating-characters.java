class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longestSubString  = 0;
        HashSet<Character> set = new HashSet<>();

        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
                longestSubString  = Math.max(longestSubString ,set.size());
            }
        }
        return longestSubString ;
    }
}