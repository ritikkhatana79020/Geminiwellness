class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for(String word : words){
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();
            res.append(reverseWord).append(" ");
        }

        return res.toString().trim();
    }
}