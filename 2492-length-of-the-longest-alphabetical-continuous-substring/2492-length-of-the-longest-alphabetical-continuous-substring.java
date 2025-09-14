class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int maxcount=1;
        for(int i=1;i<s.length();i++){
            if((s.charAt(i)-'a')-(s.charAt(i-1)-'a')==1){
                count++;
            }
            else if(s.charAt(i)==s.charAt(i-1)){
                continue;
            }
            else{
                count=1;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}