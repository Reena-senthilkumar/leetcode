class Solution {
    public int sumFourDivisors(int[] nums) {
        int result=0;
        for(int n:nums){
            int count=0;
             int sum=0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    sum+=i;
                    count++;
                    if(i!=(n/i)){
                        sum+=(n/i);
                        count++;
                    }
                }
            }
            if(count==4){
                result+=sum;
            }
        }
        return result;
}
}