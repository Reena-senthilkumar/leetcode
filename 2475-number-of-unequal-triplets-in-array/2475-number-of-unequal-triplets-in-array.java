class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int result = 0;
        int left = 0;                       
        int total = nums.length;
        for (int f : freq.values()) {
            int right = total - left - f;  
            result += left * f * right;
            left += f;                      
        }
        return result;
    }
}
