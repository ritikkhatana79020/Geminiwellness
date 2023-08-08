class Solution {
    public boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i), 1);
            }  
        }

        for(int i=0;i<str2.length();i++){
             char ch=str2.charAt(i);
             if(map.containsKey(ch)){
                 map.put(ch,map.getOrDefault(ch,0)-1);
             }
         }
         for(char key: map.keySet()){
             if(map.get(key)!=0){
                 return false;
             }
         }
         return true;
    }
}