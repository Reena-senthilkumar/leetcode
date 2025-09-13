class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxcount=1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]) continue;
            else if (nums[i] - nums[i-1] == 1) count++;
            else count =1;
            maxcount=Math.max(count,maxcount);
        }
        return nums.length == 0 ? 0 : maxcount;
    }
}
