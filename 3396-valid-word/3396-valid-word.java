public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n < 3) {
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                // Check for vowels (case-insensitive)
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(c)) {
                return false; // Invalid character if not a letter or digit
            }
        }

        return vowels >= 1 && consonants >= 1;
    }
}