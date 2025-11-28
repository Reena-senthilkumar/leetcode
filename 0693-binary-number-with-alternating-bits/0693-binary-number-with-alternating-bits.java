class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}