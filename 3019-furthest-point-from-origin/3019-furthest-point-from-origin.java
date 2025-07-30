class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int us=0;
        for(char ch:moves.toCharArray()){
            if(ch=='R'){
                right++;
            }
            else if(ch=='L'){
                left++;
            }
            else{
                us++;
            }
        }
        return Math.abs(right-left)+us;
    }
}