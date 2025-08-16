class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minAvg=Double.MAX_VALUE;
        int i=0; int j=nums.length-1;
        while(i<j){
            double avg=(double)(nums[i]+nums[j])/2;
            minAvg=Math.min(avg,minAvg);
            i++; j--;
        }
        return minAvg;
    }
}