class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString()) ? 1:2;
    }
}