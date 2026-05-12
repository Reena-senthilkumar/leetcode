class Solution {
    public int countDigits(int num) {
        if(num<10) return 1;

        int n=num;
        int count=0;
        while(n!=0){
            int rem=n%10;
            if(num%rem==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}