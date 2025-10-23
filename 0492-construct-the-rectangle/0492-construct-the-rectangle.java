class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int minDiff = Integer.MAX_VALUE;

        for (int l = 1; l * l <= area; l++) {
            if (area % l == 0) {
                int w = area / l;
                int diff = Math.abs(w - l);
                if (diff < minDiff) {
                    minDiff = diff;
                    result[0] = w;
                    result[1] = l;
                }
            }
        }
        return result;
    }
}
