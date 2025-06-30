class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        return list.size() < 3 ? list.get(0) : list.get(2);
    }
}