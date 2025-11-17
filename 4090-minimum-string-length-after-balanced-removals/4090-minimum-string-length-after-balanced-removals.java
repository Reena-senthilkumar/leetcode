class Solution {
    public int minLengthAfterRemovals(String s) {
        int result=0;
        for(char ch:s.toCharArray()){
            if(ch=='a') result++;
            else result--;
        }
        return Math.abs(result);
    }
}