class Solution {
    public char findTheDifference(String s, String t) {
        char miss = 0; // Initialize XOR result as 0
        int len = t.length();

        for(int i = 0; i < len; i++) {  
            if(i < s.length()) {  
                miss ^= s.charAt(i);  // XOR each character of s  
            }
            miss ^= t.charAt(i);  // XOR each character of t  
        }
        return miss; // The remaining character is the extra one
    }
}