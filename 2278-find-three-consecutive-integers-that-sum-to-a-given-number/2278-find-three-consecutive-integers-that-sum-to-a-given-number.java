class Solution {
    public long[] sumOfThree(long num) {
        if (num % 3 != 0) return new long[]{};
        long x = num / 3 - 1;
        return new long[]{x, x+1, x+2};
    }
}
