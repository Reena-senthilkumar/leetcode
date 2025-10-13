class Solution {
    public int countGoodSubstrings(String s) {
       int count=0;
        for(int i=2;i<s.length();i++){
            String temp=s.substring(i-2,i+1);
            if(temp.charAt(0)!=temp.charAt(1) && temp.charAt(1)!=temp.charAt(2) && temp.charAt(0)!=temp.charAt(2)){
                count++;
            }
        }
        return count;
    }
}