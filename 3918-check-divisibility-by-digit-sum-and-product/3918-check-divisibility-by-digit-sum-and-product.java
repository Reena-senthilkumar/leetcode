class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int tem=n;
        while(n!=0){
            sum+=n%10;
            mul*=n%10;
            n/=10;
        }
        return tem%(sum+mul)==0;
    }
}