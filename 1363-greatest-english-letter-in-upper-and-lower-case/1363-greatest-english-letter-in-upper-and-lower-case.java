class Solution {
    public String greatestLetter(String s) {
        String result = "";
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if (s.contains(String.valueOf(ch)) && s.contains(String.valueOf(Character.toLowerCase(ch)))) {
                return String.valueOf(ch);  // return the first greatest found
            }
        }
        return result;
    }
}
