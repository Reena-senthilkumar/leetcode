class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        while(left<=right){
            String s=Integer.toBinaryString(left);
            int count=0;
                for(char ch:s.toCharArray()){
                    if(ch=='1') count++;
                }
                        left++;
                if(isPrime(count)) result++;
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