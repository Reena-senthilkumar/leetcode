class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
int currentSum = nums[0];
for (int i = 1; i < nums.length; i++) {
    currentSum = Math.max(nums[i], currentSum + nums[i]);  //4 5+4=9  9, -1 9-1=8 8
    maxSum = Math.max(maxSum, currentSum);  //4 9 9 , 9 8 9,
}
return maxSum;
    }
}