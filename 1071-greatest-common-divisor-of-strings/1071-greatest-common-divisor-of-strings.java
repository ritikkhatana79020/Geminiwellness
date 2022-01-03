class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        } 

        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }   

        String reminder = str1.substring(str2.length());
        // System.out.println(reminder);
        if (reminder.isEmpty()) {
            return str2;
        }

        return gcdOfStrings(str2, reminder);
        
    }
}