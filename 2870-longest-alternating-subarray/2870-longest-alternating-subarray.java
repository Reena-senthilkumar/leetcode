class Solution {
    public int alternatingSubarray(int[] nums) {
        int maxLen = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) continue;

            int len = 2; // At least two elements: nums[i], nums[i+1]
            int diff = -1; // Next expected diff after +1

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j + 1] - nums[j] == diff) {
                    len++;
                    diff *= -1; // flip between 1 and -1
                } else {
                    break;
                }
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}
