class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int count=0;
        int prev_rem=0;
        while(count<=k){
            count++;
            if((prev_rem*10+1) % k==0){
                return count;
            }
            prev_rem=(prev_rem*10+1) % k;
        }
        return -1;
    }
}