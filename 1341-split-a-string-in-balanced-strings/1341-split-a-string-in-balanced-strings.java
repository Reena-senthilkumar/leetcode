class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int c=0;
         for(char ch:s.toCharArray()){
            if(ch=='L') {
                l++;
            }else {
            l--;
            }
            if(l==0) c++;
         }
         return c;
    }
}