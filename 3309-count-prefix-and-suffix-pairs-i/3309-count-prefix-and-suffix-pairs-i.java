class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
                            int n=words[i].length();
            for(int j=i+1;j<words.length;j++){
                if (words[j].length() >= n &&
                    words[i].equals(words[j].substring(0, n)) &&
    words[i].equals(words[j].substring(words[j].length() - n))){
                    count++;
                }
            }
        }
        return count;
    }
}