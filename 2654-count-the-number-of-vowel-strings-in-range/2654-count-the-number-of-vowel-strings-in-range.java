class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vowel="aeiou";
        int count=0;
        for(int i=left;i<=right;i++){
            String s=words[i];
            if(vowel.contains(String.valueOf(s.charAt(0))) && vowel.contains(String.valueOf(s.charAt(s.length()-1)))) {
                count++;
            }
        }
        return count;
    }
}