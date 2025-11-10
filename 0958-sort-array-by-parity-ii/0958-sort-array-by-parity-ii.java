class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {
            if (num % 2 == 0) {        // even number
                result[evenIndex] = num;
                evenIndex += 2;
            } else {                   // odd number
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }
}
