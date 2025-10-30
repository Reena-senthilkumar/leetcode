class Solution {
    public int minCostToMoveChips(int[] position) {
        int a=0; int b=0;
        for(int n:position){
            if(n%2==0) a++;
            else b++;
        }
        return Math.min(a,b);

    }
}