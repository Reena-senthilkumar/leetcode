class Solution {
    public int minimumChairs(String s) {
        int chair=0; 
        int max=0;

        for(char ch:s.toCharArray()){
            if(ch=='E'){
                chair++;
                max=Math.max(chair,max);
            }
            else{
                chair--;
            }
        }
        return max;
    }
}