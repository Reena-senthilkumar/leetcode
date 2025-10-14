class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                StringBuilder sb=new StringBuilder(words[j]).reverse();
                if(words[i].equals(sb.toString())){
                    result++;
                }
            }
        }
        return result;
    }
}