class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sa = s.split(" ");
        if (pattern.length() != sa.length) {
            return false;
        }
        
        Map<Character, String> table = new HashMap<>();
        Set<String> usedWords = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = sa[i];
            
            if (table.containsKey(c)) {
                if (!table.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }
                table.put(c, word);
                usedWords.add(word);
            }
        }
        
        return true;
    }
}
