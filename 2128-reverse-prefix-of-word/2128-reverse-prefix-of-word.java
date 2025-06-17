class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        for(int i=word.indexOf(ch);i>=0;i--){
            sb.append(word.charAt(i));
        }
        for(int i=word.indexOf(ch)+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}