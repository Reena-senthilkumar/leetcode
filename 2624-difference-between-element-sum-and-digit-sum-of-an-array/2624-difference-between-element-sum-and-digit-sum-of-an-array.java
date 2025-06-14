class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int num:nums){
            sum1+=num;
        }
        for(int num:nums){
          while(num!=0){
            int rem=num%10;
            sum2+=rem;
            num=num/10;
          }
        }
        return Math.abs(sum1-sum2);
    }
}