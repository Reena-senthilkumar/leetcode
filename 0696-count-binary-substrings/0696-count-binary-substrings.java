class Solution {
    public int countBinarySubstrings(String s) {
        int res=0;
        int prev=0;
        int ss=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                ss++;
            }
            else{
                prev=ss;
                ss=1;
            }
            if(ss<=prev) res++;
        }
        return res;
    }
}