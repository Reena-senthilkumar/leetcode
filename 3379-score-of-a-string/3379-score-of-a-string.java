class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            sum+=Math.abs((int)(s.charAt(i-1))-(int)(s.charAt(i)));
        }
        return sum;
    }
}