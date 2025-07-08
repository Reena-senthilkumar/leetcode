class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int i = 0, j = nums.length - 1;

        while (i < j) {
            double avg = (nums[i] + nums[j]) / 2.0;
            set.add(avg);
            i++;
            j--;
        }

        return set.size();
    }
}
