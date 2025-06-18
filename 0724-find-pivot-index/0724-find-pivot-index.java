class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int lt=0;
        for(int i=0;i<nums.length;i++){
            int rt=total-lt-nums[i];
            if(rt==lt){
                return i;
            }
            lt+=nums[i];
        }
        return -1;
    }
}