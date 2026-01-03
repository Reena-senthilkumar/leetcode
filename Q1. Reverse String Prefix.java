class Solution {
    public String reversePrefix(String s, int k) {
StringBuilder sb=new StringBuilder();
            for(int j=k-1;j>=0;j--){
                sb.append(s.charAt(j));
            }
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}©leetcode
