class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int len = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1,i);
            }

            map.put(s.charAt(j),j);
            len=Math.max(j-i+1,len);
            j++;
        }

        return len;
    }
}