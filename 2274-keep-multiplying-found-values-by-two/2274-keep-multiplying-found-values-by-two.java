class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list=new LinkedList<>();
        for(int num:nums){
            list.add(num);
        }
        while(list.contains(original)){
            original=2*original;
        }
        return original;
    }
}