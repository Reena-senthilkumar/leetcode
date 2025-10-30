class Solution {
    public int trailingZeroes(int n) {
        int count=0; int temp=5;
        while(n>=temp){
           count+=(n/temp);
           temp*=5;
        }
        return count;
    }
}