class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String S:operations){
            if(S.equals("--X")) --x;
            else if(S.equals("++X")) ++x;
            else if(S.equals("X--")) x--;
            else x++;
        }
        return x;
    }
}