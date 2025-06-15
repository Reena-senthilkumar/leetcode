class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean re = true;
            for (char ch : word.toCharArray()) {
                if (!allowed.contains(String.valueOf(ch))) {
                    re = false;
                    break;
                }
            }
            if (re) {
                count++;
            }
        }
        return count;
    }
}
