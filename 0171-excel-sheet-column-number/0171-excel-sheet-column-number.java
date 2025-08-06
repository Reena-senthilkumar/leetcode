class Solution {
    public int titleToNumber(String columnTitle) {
        int val=0;
        for(int i=0;i<columnTitle.length();i++){
            val=val*26+columnTitle.charAt(i)-'A'+1;
        }
        return val;
    }
}