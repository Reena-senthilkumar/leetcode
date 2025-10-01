import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Copy and sort in descending order
        Integer[] sorted = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());

        // Map score -> rank string
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            if (i == 0) map.put(sorted[i], "Gold Medal");
            else if (i == 1) map.put(sorted[i], "Silver Medal");
            else if (i == 2) map.put(sorted[i], "Bronze Medal");
            else map.put(sorted[i], String.valueOf(i + 1));
        }

        // Build result for original order
        for (int i = 0; i < n; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}
