class Solution {
    public int numberOfSpecialChars(String word) {
        int lc=97;
        int uc=65;
        int count=0;
        while(lc<=122 && uc<=90){
if (word.contains(String.valueOf((char) lc)) && word.contains(String.valueOf((char) uc))) {
            count++;
        }lc++; uc++;
        }
        return count;
    }
}