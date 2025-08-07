class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > 2) {
                return false; 
            }
        }

        return true;
    }
}
