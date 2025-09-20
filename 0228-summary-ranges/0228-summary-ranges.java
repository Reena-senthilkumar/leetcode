class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();

        int i = 0;
        while (i < nums.length) {
            int start = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start == i) {
                list.add(String.valueOf(nums[start]));
            } else {
                list.add(nums[start] + "->" + nums[i]);
            }
            i++;
        }
        return list;
    }
}