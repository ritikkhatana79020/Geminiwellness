class Solution {
    public boolean isAnagram(String s, String t) {
    
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }else{
                return false;
            }
        }

        for(char ch : s.toCharArray()){
            if(map.get(ch)!=0){
                return false;
            }
        }
        return true;
    }
}