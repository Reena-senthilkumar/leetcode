class Solution {
    public int[] runningSum(int[] nums) {
        int result[]=new int[nums.length];
        int index=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
            result[index++]=sum;
        }
        return result;
    }
}