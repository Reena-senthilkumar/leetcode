class Solution {
    public int gcdOfOddEvenSums(int n) {
        // if (n==1) return 1;
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=2*n;i++){
            if(i%2!=0){
            oddsum+=i;
            }
            else{
                evensum+=i;
            }
        }
        int gcd=1;
        for(int i=1;i<Math.min(oddsum,evensum);i++){
            if(oddsum%i==0 && evensum%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}