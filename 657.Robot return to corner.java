class Solution {
    public boolean judgeCircle(String moves) {
        int count=0;
        int count1=0;
        char[] c=moves.toCharArray();
        for(char ch:c){
            if(ch=='U' ){
                count++;
            }else if(ch=='D' ){
                count--;
            }
            else if(ch=='R'){
                count1++;
            }
            else if(ch=='L'){
                count1--;
            }
        }
        
        return count==0 && count1==0;
    }
}
