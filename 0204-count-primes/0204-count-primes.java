class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int count=0;
        boolean[] isprime=new boolean[n];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;

        for(int i=2;i*i<n;i++){
            if(isprime[i]){
            for(int j=i*i;j<n;j+=i){
                    isprime[j]=false;
                }
            }
        }
              
        for(boolean prime:isprime){
            if(prime) count++;
        }
        return count;
    }
}