class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String key = new String(cArr);
            
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        
        ans.addAll(map.values());
        
        return ans;
        
    }
}