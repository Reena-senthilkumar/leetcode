class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=Integer.MIN_VALUE;
       for(int i=0;i<nums.length-k+1;i++){
        int sum=0;
        double avg=0;
        for(int j=i;j<i+k;j++){
            sum+=nums[j];
        }
        avg=(double)sum/k;
        maxavg=Math.max(avg,maxavg);
       }
       return maxavg;
    }
}