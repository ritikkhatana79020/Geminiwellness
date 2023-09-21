class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubString = 0;
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else{
                i=map.get(arr[i]);
                map.clear();
            }

            if(map.size()>longestSubString){
                longestSubString = map.size();
            }
        }

        return longestSubString;
    }
}