import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : arr2) {
            int freq = map.get(num);
            for (int i = 0; i < freq; i++) {
                result.add(num);
            }
            map.remove(num);
        }
        List<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining); 

        for (int num : remaining) {
            int freq = map.get(num);
            for (int i = 0; i < freq; i++) {
                result.add(num);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
