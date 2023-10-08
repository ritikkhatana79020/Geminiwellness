class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;

        int N = s.length();
        Set<Character> set  = new HashSet<>();
        int size = 0;

        while(j<N){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                j++;
                size = Math.max(size,set.size());
            }
        }
        return size;
    }
}