class Solution {
    public int singleNumber(int[] nums) {
        return IntStream.of(nums).reduce(0,(x,y) -> x^y);
    }
}