class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        while(left<=right){
            int bitcount=Integer.bitCount(left);
                        left++;
                if(isPrime(bitcount)) result++;
            }
            return result;
        }
        public static boolean isPrime(int n){
            if(n<2) return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }